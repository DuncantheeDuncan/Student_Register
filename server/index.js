let express = require('express');
let app = express();

//app.get("/", function(req, res){
  //res.send("student register sever on");
//});

let PORT = process.env.PORT || 3008;

app.listen(PORT, function(){
  console.log('App starting on port http://localhost:',PORT);
});


const exphbs  = require('express-handlebars');


app.engine('handlebars', exphbs({defaultLayout: 'main'}));
app.set('view engine', 'handlebars');


app.get('/', function (req, res) {
    res.render('index');
});




app.get('/admin', function (req, res) {
  console.log("Hello");
  res.render('index');
});
