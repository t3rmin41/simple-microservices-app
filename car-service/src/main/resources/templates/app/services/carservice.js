//$http - built-in service for HTTP handling
//$q - service to run functions asynchronously
angular.module('carsApp.services', ['ngResource']).factory('CarService', function ($http, $q) {
    return {
        getCars : function(carId) {
            var promise;
            if (carId != undefined) {
                promise = $http({ method : 'GET', url : '/cars/' + carId, isArray : true})
                    .success(function (data, status, headers) {
                        console.log('Data in service carId == ' + carId);
                        console.log(data);
                    })
                    .error(function (data, status, header) {
                        console.log('error');
                    });
            } else {
                promise = $http({ method : 'GET', url : '/cars/', isArray : true })
                    .success(function (data, status, headers) {
                        console.log('Data in service');
                        console.log(data);
                    })
                    .error(function (data, status, header) {
                        console.log('error');
                    });
            }
            return promise;
        }
    }
});
