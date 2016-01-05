//$http - built-in service for HTTP handling
//$q - service to run functions asynchronously
angular.module('carsApp.services', ['ngResource']).factory('CarService', function ($http, $q) {
    return {
        getCars : function(carId) {
            /*
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
            
            if (carId != undefined) {
                return $http({ method : 'GET', url : 'http://localhost:8881/cars/' + carId})
                    .then(function (result) {
                        console.log('Data in service carId == ' + carId);
                        console.log(result);
                        return result.data;
                    })
                    .catch(function (result) {
                        console.log('error');
                        return result.data;
                    })
                    .finally(function (response) {
                        console.log('Finished getting from service');
                    });
            } else {
                return $http({ method : 'GET', url : 'http://localhost:8881/cars/'})
                .then(function (response) {
                    console.log('Data in service');
                    console.log(response);
                    return response.data;
                })
                .catch(function (result) {
                    console.log('error');
                    return result.data;
                })
                .finally(function (response) {
                    console.log('Finished getting from service');
                });
            }
            /**/
        }
    }
});
