const mqtt = require('mqtt')
             // mqtt.connect([url], options)
const client  = mqtt.connect('mqtt://localhost:1883')

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

