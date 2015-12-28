var app = angular.module('carsApp.controllers', []);

app.controller('CarController', ['$scope', 'CarFactory', function($scope, CarFactory){
    CarFactory.get({}, function(carFactory){
        var cars = CarFactory.query(function(){
            console.log(cars);
        })
    })
}]);
