
angular.module('carsApp.controllers', ['ngResource']);

// $scope - object through which models (entities) are accessed in HTML view.
// Hence, $scope is the container for other user-defines objects
carApp.controller('CarController', function($scope, CarService) {
    var id = 1;
    CarService.getCars(id)
        .then(
            function(response) { 
                $scope.cars = [response.data];
                console.log("$scope.cars inside CarService call = " + JSON.stringify($scope.cars));
            },
            function(error) { 
                $scope.hasErrors = true;
            }
        ).
        catch(function() {
            console.log("Exception caught");
        }).
        finally(function() {
            console.log("Finished getting car");
        });
    $scope.items = [
                    {"id":1,"model":"S600","manufacturer":"Mercedes","price":1000.52},
                    {"id":2,"model":"S80","manufacturer":"Volvo","price":500.27}
                   ];
    console.log("Static $scope.items = " + JSON.stringify($scope.items));
//    CarService.getCars()
//        .then(
//            function(response) { 
//                $scope.cars = response.data;
//                console.log("$scope.cars inside CarService call = " + JSON.stringify($scope.cars));
//            },
//            function(error) { 
//                $scope.hasErrors = true;
//            }
//        );
    console.log("$scope.cars outside CarService call = " + JSON.stringify($scope.cars));
});