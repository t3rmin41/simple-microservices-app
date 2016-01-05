'use strict';

//Usage: enter in shell "node node-car-app.js"

var express = require('express');
var http = require('http');
var path = require('path');
var morgan = require('morgan'); // formerly express.logger
var errorhandler = require('errorhandler');
var app = express();
 
// all environments
app.set('port', process.env.PORT || 3000);
app.engine('html', require('ejs').renderFile);
 
// express/connect middleware
app.use(morgan('dev'));
 
// serve up static assets
app.use('/app', express.static(path.join(__dirname, 'app')));
app.use('/bower_resources', express.static(path.join(__dirname, 'bower_components')));

//Serve HTTP request
app.get('/', function(request, response){
    response.sendFile(path.resolve("index.html"));
});

// development only
if ('development' === app.get('env')) {
  app.use(errorhandler());
}
 
http.createServer(app).listen(app.get('port'), function () {
   console.log('CarApp server listening on port ' + app.get('port'));
});