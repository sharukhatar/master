// Import builtin NodeJS modules to instantiate the service
const https = require("https");
const fs = require("fs");
const path = require('path');
var hashpw

var hashes=require('jshashes')
// Import the express module

const express = require("express");

// Instantiate an Express application
const app = express();

// Create a NodeJS HTTPS listener on port 4000 that points to the Express app

// Use a callback function to tell when the server is created.

https
.createServer(
		{
	key: fs.readFileSync("key.pem"),

	cert: fs.readFileSync("cert.pem"),
			
		},app)
.listen(4000, ()=>{
console.log('server is runing at port 4000')
});

// Create an try point route for the Express app listening on port 4000.

// This code tells the service to listed to any request coming to the route.
// Once the request is received, it will display a message "Hello from express server."

app.get('/', (req,res)=>{
res.send("Hello from express server.")

})
app.get('/reg.html',function(req,res){
    res.sendFile('/reg.html',{root : __dirname});
})

app.get('/action_page',function(req,res)
{
    console.log(req.query.email);
    console.log(req.query.psw);
    var pw=req.query.psw;
    hashpw= new hashes.SHA1().b64(pw)
    
    res.send(req.query.email + " password "+ req.query.psw +"  hash "+ hashpw);
});

app.get('/login.html',function(req,res){
    res.sendFile('/login.html',{root : __dirname});
})

app.get('/login_page',function(req,res)
{
    console.log(req.query.email);
    console.log(req.query.psw);
    var pw=req.query.psw;
    newpw= new hashes.SHA1().b64(pw)
    if(newpw === hashpw){
        console.log("yes")
        res.send("WELCOME YOU LOGIN PAGE");
    }
    else{
        res.send("LOGIN FAILED");
    }
    
    
});
	
//route to download a file
app.get('/download',(req, res) => {
    var file = req.params.file;
    var fileLocation = path.join('./blink_esp32',"blink_esp32.ino.esp32.bin");
    console.log(fileLocation);
    res.download(fileLocation, file);
});
