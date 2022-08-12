const mqtt = require('mqtt')
const client  = mqtt.connect('mqtt://localhost:1883') // connect to broker (brokers url)

const TOPIC = "diot";

//event =connect
client.on("connect", function(){  
    console.log("Broker Connected");      
    client.publish( TOPIC, "{temp: 24.5 C}", {qos :1})   //mqtt.Client#publish(topic, message, [options], [callback])
});         