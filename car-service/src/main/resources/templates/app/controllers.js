angular.module('carsApp.controllers', []);

angular.module('carsApp.controllers').controller('CarController', function($scope, Entry){
    var entries = Entry.query(function() {
        console.log(entries);
    });
});
