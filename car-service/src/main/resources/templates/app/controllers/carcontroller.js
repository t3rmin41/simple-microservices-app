
angular.module('carsApp.controllers', ['ngResource']);

// $scope - object through which models (entities) are accessed in HTML view.
// Hence, $scope is the container for other user-defines objects
carApp.controller('CarController', function($scope, CarService) {
    var id = 1;
    CarService.getCars(id)
        .then(
            function(data) { 
                $scope.cars = [data];
                console.log("$scope.cars inside CarService call = " + JSON.stringify($scope.cars));
        })
        .catch(function(data) {
            console.log("Error caught");
            $scope.hasErrors = true;
        })
        .finally(function() {
            console.log("Finished getting car");
        });
    $scope.items = [
                    {"id":1,"model":"S600","manufacturer":"Mercedes","price":1000.52},
                    {"id":2,"model":"S80","manufacturer":"Volvo","price":500.27}
                   ];
    console.log("Static $scope.items = " + JSON.stringify($scope.items));
    
//    var carServicePromise = CarService.getCars();
//    carServicePromise
//        .then(
//            function(data) { 
//                $scope.cars = data;
//                console.log("$scope.cars inside CarService call = " + JSON.stringify($scope.cars));
//         })
//         .catch(
//             function(data) {
//                 console.log("Error caught");
//                 $scope.hasErrors = true;
//         })
//         .finally(
//             function(){
//                 console.log('Finally finished from controller');
//         });
    console.log("$scope.cars outside CarService call = " + JSON.stringify($scope.cars));
});