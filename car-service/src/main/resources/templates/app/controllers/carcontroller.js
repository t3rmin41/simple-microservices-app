angular.module('carsApp.controllers', ['ngResource']);

// $scope - object through which models (entities) are accessed in HTML view.
// Hence, $scope is the container for other user-defines objects
carApp.controller('CarController', function($scope, CarService) {
    //var id = 1;
    //$scope.cars = CarService.getCars(id);
    $scope.cars = CarService.getCars();
});