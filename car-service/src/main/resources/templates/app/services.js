angular.module('carsApp.services').
    factory('CarService', function($http) {
        var CarService = {};
        $http.get('/cars').success(function(response) {
            CarService.data = response;
        });
        console.log(CarService.data);
        return CarService;
    }
);