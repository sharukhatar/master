const mqtt = require('mqtt')
             // mqtt.connect([url], options)
const client  = mqtt.connect('mqtt://localhost:1883',{
   // protocolVersion: 5 // will not accept only accept 3.1.1
   protocolVersion: 4,
   protocolId: "MQTT",
   clean : true,
   clientId: 'diot_device_1',
  // qos:1
    will :{
        topic: 'device/dead',
        payload: Buffer.from('I am dead'), // Payloads are buffers
    },
    keepalive:5

})

const TOPIC = "diot";

//event connect is for client to connect broker { .... [BROKER] <---- (client)  }
client.on("connect", function(){

    //subscribe only after successfully connecting with Broker
    client.subscribe(TOPIC, function(err){
        if(!err){
            console.log(`Successful subcribtion to ${TOPIC}`);
        }
    });
}) ;

//
client.on('message', function (topic, message) {
    // message is Buffer
    console.log("Topic Name : "+topic)
    console.log(message.toString())

    client.end()
  })

