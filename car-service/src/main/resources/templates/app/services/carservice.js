//$http - built-in service for HTTP handling
//$q - service to run functions asynchronously
angular.module('carsApp.services', ['ngResource']).factory('CarService', function ($http, $q) {
    return {
        getCars : function(carId) {
            /**/
            var promise;
            if (carId != undefined) {
                promise = $http({ method : 'GET', url : '/cars/' + carId})
                    .success(function (data, status, headers) {
                        console.log('Data in service carId == ' + carId);
                        console.log(data);
                    })
                    .error(function (data, status, header) {
                        console.log('error');
                    });
            } else {
                promise = $http({ method : 'GET', url : '/cars/'})
                    .success(function (data, status, headers) {
                        console.log('Data in service');
                        console.log(data);
                    })
                    .error(function (data, status, header) {
                        console.log('error');
                    });
            }
            return promise;
            /**/
            /*
            if (carId != undefined) {
                return $http({ method : 'GET', url : '/cars/' + carId})
                    .then(function (response) {
                        console.log('Data in service carId == ' + carId);
                        console.log(response.data);
                    })
                    .catch(function (response) {
                        console.log('error');
                    })
                    .finally(function (response) {
                        console.log('Finished getting from service');
                    });
            } else {
                return $http({ method : 'GET', url : '/cars/'})
                .then(function (response) {
                    console.log('Data in service');
                    console.log(response.data);
                })
                .catch(function (response) {
                    console.log('error');
                })
                .finally(function (response) {
                    console.log('Finished getting from service');
                });
            }
            /**/
        }
    }
});
