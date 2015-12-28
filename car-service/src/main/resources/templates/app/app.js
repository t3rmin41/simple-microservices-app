//angular.module('carsApp',['ngResource']);
//angular.module('simpleApp', [])
//.controller('SimpleController', function($scope) {
//    $scope.data = {message: "Hello"};
//});

//angular.module('carsApp.controllers', []);
//angular.module('carsApp.services', []);
//angular.module('carsApp', ['ngResource', 'carsApp.controllers', 'carsApp.services']);


'use strict';

angular.module('carsApp', ['carApp.services', 'carApp.controllers']);
