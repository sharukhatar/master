const coap = require('coap')
const server = coap.createServer()

server.on('request', (req, res) => {


    if(req.url == "/temp"){
    res.end('Temp: 24.5');
    }
    else{
  res.end('Hello :' + req.url.split('/')[1] + '\n')
    }
})


// the default CoAP port is 5683
server.listen(() => {
  console.log("coap server started...");
})