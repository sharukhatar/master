
import random
import requests
import time
import json

URL = 'https://sleepy-island-07017.herokuapp.com/sensor'
data = open('app.env','r')
lines =list(data)
data.close()
Line1 = lines[0].split('=')
Line2 = lines[1].split('=')
API_KEY=Line1[1].replace('\n','')
TOKEN=Line2[1].replace('\n','')
def sendRequest(body):
  body["API_KEY"]="0nwgBwb9Bb8gIBI"
  payload=json.dumps(body)
  auth={"Content-Type":"application/json","Autorization":"Barer " +TOKEN}
  result=requests.post(URL,data=payload,hraders=auth)
  print(result)

if __name__ == "__main__":
  while True:
    currentData = random.randint(65, 191)
    time.sleep(2)
    body={
      "API_KEY":"0nwgBwb9Bb8gIBI",
      "type":"kitchen",
      "tag":"esp32",
      "value":currentData,
   "unit":"D"
    }
    sendRequest(body)
