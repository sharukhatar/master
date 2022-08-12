//GET https://api.thingspeak.com/update?api_key=A00PURE9LEERFGOK&field1=0
const axios = require('axios').default;
axios({
    method:"post",
    url:"https://api.thingspeak.com/update",
    params:{
        api_key:"VGNOQ4DMQD4BT01F",
        field1:20,
        field2:77,
        field3:45,
        field4:"pune",
        field5:"220340126005"
    }
   
}).then((dat)=>{
    console.log(dat)
})
