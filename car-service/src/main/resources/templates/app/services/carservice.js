//$http - built-in service
angular.module('carsApp.services', ['ngResource']).factory('CarService', function ($http) {
    return {
        getCars: function(carId) {
            if (carId != undefined) {
                $http.get('/cars/' + carId)
                    .success(function (data, status, headers) {
                        console.log('Data in service carId == ' + carId);
                        console.log(data);
                    })
                    .error(function (data, status, header) {
                        console.log('error');
                    });
            } else {
                $http.get('/cars')
                    .success(function (data, status, headers) {
                        console.log('Data in service');
                        console.log(data);
                    })
                    .error(function (data, status, header) {
                        console.log('error');
                    });
            }
            
        }
    }
});
