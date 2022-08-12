const coap = require('coap') // or coap
const server = coap.createServer()

server.on('request', (req, res) => {
    console.log(req.url);
    if(req.url=='/temp'){
        if(req.code==0.01){
            res.end('temp: 24.5')
        }else{
           
            res.end("not supported");
        }
   
    }
    //res.end('Hello ' + req.url.split('/')[1] + '\n')
})

server.listen(() => {
    console.log('server started')
})