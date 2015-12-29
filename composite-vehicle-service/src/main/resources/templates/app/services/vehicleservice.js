//$http - built-in service for HTTP handling
//$q - service to run functions asynchronously
angular.module('vehiclesApp.services', ['ngResource']).factory('VehicleService', function ($http, $q) {
    return {
        getVehicleSummary : function() {
            var promise;
            promise = $http({ method : 'GET', url : '/vehicles/', isArray : true })
                        .success(function (data, status, headers) {
                            console.log('Data in service');
                            console.log(data);
                        })
                        .error(function (data, status, header) {
                            console.log('error');
                        });
            return promise;
        }
    }
});
