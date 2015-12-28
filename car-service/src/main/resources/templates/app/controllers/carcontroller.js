
angular.module('carsApp.controllers', ['ngResource']);

// $scope - object through which models (entities) are accessed in HTML view.
// Hence, $scope is the container for other user-defines objects
carApp.controller('CarController', function($scope, CarService) {
    //var id = 1;
    //$scope.cars = CarService.getCars(id);
    $scope.items = [
                    {"id":1,"model":"S600","manufacturer":"Mercedes","price":1000.52},
                    {"id":2,"model":"S80","manufacturer":"Volvo","price":500.27}
                   ];
    console.log("Static $scope.items = " + JSON.stringify($scope.items));
//    CarService.getCars()
//    .then(
//        function(response) { 
//            $scope.cars = response; 
//        },
//        function(error) { 
//            $scope.hasErrors = true;
//        });
    $scope.cars = CarService.getCars();
    console.log("Non-static $scope.cars = " + JSON.stringify($scope.cars));
});