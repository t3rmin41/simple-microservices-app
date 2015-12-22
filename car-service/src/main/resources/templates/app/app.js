(function(angular) {
  angular.module("usersApp.controllers", []);
  angular.module("usersApp.services", []);
  angular.module("usersApp", ["ngResource", "usersApp.controllers", "services/usersApp.services"]);
}(angular));