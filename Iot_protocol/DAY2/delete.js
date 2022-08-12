const axios = require('axios').default;
  axios({
  method: 'delete',
  url: 'https://sleepy-island-07017.herokuapp.com/users/me',
    headers:{Authorization:"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2Mjk3NjgzNjFhMTU1ZDAwMTcyMWM4ZDUiLCJpYXQiOjE2NTQwODk3ODJ9.JmcKBOtogC6v9KmS_KNZa387mggs9noPDFhg7nwk6YU"}   
}
  )
  .then(function (response) {
    console.log(response);
  })
  .catch(function (error) {
    console.log(error);
  });
