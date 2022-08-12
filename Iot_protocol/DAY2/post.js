const axios = require('axios').default;
  axios({
  method: 'post',
  url: 'https://sleepy-island-07017.herokuapp.com/sensor',
  data: {
  "API_KEY":"0nwgBwb9Bb8gIBI",
   "type":"kitchen",
   "tag":"esp32",
   "value":27,
   "unit":"D"
    },
    headers:{Authorization:"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2Mjk2MzQyYWE4ODYwYjAwMTczMDcwY2QiLCJpYXQiOjE2NTQxNzk4OTJ9.agP74vYkmKSJCbzT56UMQEkzw0RT5yJCvfVZqpDzQgI"}   
}
  )
  .then(function (response) {
    console.log(response);
  })
  .catch(function (error) {
    console.log(error);
  });
