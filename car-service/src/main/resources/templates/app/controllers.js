var app = angular.module('carsApp.controllers', []);

app.controller('CarController', ['$scope', 'CarFactory', function($scope, CarFactory){
    CarFactory.get({}, function(carFactory){
        var cars = CarFactory.query(function(){
            console.log(cars);
        })
    })
}]);

//angular.module('carsApp.controllers').controller('CarController', function($scope, Entry){
//    var entries = Entry.query(function() {
//        console.log(entries);
//    });
//});
