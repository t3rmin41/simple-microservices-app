//Only 1 (one!) AngularJS application can be auto-bootstrapped per HTML document.
/*
var simpleApp = angular.module('simpleApp', [])
    .controller('SimpleController', function($scope) {
        $scope.helloData = {message: "Hello"};
    });
/**/

var carApp = angular.module('carsApp', ['ngResource', 'carsApp.controllers', 'carsApp.services']);

