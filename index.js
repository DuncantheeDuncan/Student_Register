let express = require('express');
let app = express();

app.get("/", function(req, res){
  res.send("student register sever on");
});

let PORT = process.env.PORT || 3009;

app.listen(PORT, function(){
  console.log('App starting on port http://localhost:', PORT);
});
