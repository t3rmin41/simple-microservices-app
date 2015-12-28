//angular.module('simpleApp', [])
//.controller('SimpleController', function($scope) {
//    $scope.data = {message: 'Hello'};
//});
angular.module('carsApp', []);
angular.module('carsApp.controllers', []);
angular.module('carsApp.services', []);
angular.module('carsApp', ['ngResource', 'carsApp.controllers', 'carsApp.services']);