const mqtt = require('mqtt');
const client  = mqtt.connect('mqtt://localhost:1883');
const TOPIC = "diot";
client.on('connect', function () {
    //subscribe only after success connection with broker
  client.subscribe(TOPIC, function (err) {
    if(!err) {
        console.log(`succesfully subscribed to the ${TOPIC}`)
     // client.publish('presence', 'Hello mqtt')
    }
  })
})

client.on('message', function (topic, message) {
  // message is Buffer
  console.log(message.toString())
  client.end()
})