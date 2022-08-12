import paho.mqtt.client as mqtt
print("starting subscriber")
def on_connect(client, userdata, flags, rc):
    if rc==0:
            print("--connected to the broker--")

topic =input("Enter the topic to subscribe = ") 
Qos = 0
client = mqtt.client()


client.on_connect  = on_connect        

client.connect("127.0.0.1",1883)
