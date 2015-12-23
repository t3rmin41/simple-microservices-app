angular.module('carsApp.services').factory('Entry', function($resource) {
    return $resource('/cars/:id'); // Note the full endpoint address
});