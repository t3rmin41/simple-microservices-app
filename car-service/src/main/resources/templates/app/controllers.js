angular.module('carsApp.controllers').controller('CarController', ['$scope', '$http', function(){
    $scope.carService = carService;
}]);