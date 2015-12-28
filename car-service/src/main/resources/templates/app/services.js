var services = angular.module('carsApp.services', ['ngResource']);

services.factory('CarFactory', function($resource){
    return $resource('/cars', {},{
        query: {
            method: 'GET',
            params: {},
        }
    })
});

//angular.module('carsApp.services').factory('Entry', function($resource) {
//    return $resource('/cars/:id'); // Note the full endpoint address
//});