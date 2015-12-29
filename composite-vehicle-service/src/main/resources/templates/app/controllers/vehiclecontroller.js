
angular.module('vehiclesApp.controllers', ['ngResource']);

// $scope - object through which models (entities) are accessed in HTML view.
// Hence, $scope is the container for other user-defines objects
vehicleApp.controller('VehicleController', function($scope, VehicleService) {
    VehicleService.getVehicleSummary()
        .then(
            function(response) { 
                $scope.vehicleSummary = response.data;
                $scope.cars = $scope.vehicleSummary.cars;
                $scope.trucks = $scope.vehicleSummary.trucks;
                console.log("$scope.vehicleSummary inside CarService call = " + JSON.stringify($scope.vehicleSummary));
            },
            function(error) { 
                $scope.hasErrors = true;
            }
        );
});