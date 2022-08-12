
import paho.mqtt.client as mqtt
print("starting server")

topic =input("Enter the topic to publish = ") 
Qos = 0
client = mqtt.Client()


def on_connect(client, userdata, flags, rc):
    if rc==0:
        print("connected to the broker")
        client.publish(topic,"hello",Qos)

client.on_connect  = on_connect        

client.connect("127.0.0.1",1883)
client.loop_start()

try:
    while True:
        message = input("Enter the message to change:")
        (rc,mid)=client.publish(topic,message,Qos)
        if rc==0:
            print("--message sent--")
            
except KeyboardInterrupt:
 client.disconnect()
 client.loop_stop()        
