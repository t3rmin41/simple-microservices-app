function CarsController($scope, $http){
    //$scope.getCar = function() {           
        $http({
            method: 'GET',
            url: 'http://localhost:8881/car/2'
        }).
        success(function(data, status, headers, config) {
            $scope.car = data;
        }).
        error(function(data, status, headers, config) {
          // called asynchronously if an error occurs
          // or server returns response with an error status.
        });
    //};
}