const axios = require("axios")

var aqi = 20
var co2 = 77
var o2 = 45

function intervalReposting() {
	axios({
		method : "post",
		url : "https://api.thingspeak.com/update",
		params : {
		    "api_key" : "VGNOQ4DMQD4BT01F",
		    "field1" : aqi,
		    "field2" : co2,
		    "field3" : o2,
		    "field4" : "pune",
            "field5" : "220340126005"
		}
	})
	.then(function(response){
	 console.log(response.status);
	})
	.catch(function(error){
	 console.log(error.response);
	})
    aqi += 1
    co2 += 1
    o2 +=1
}

setInterval(intervalReposting, 120000)
