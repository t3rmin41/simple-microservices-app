//Only 1 (one!) AngularJS application can be auto-bootstrapped per HTML document.
/*
var simpleApp = angular.module('simpleApp', [])
    .controller('SimpleController', function($scope) {
        $scope.helloData = {message: "Hello"};
    });
/**/

//usage of angular.module:
//angular.module('%module_name%', ['%dependent_module_name%',...])

var carApp = angular.module('carsApp', ['ngResource', 'carsApp.services', 'carsApp.controllers']);

