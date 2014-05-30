'use strict';


// Declare app level module which depends on filters, and services
angular.module('myApp', [
  'ngRoute',
//  'myApp.filters',
//  'myApp.services',
//  'myApp.directives',
  'myApp.car',
  'myApp.driver',
  'myApp.transportation'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/car', {templateUrl: 'partials/car.html', controller: 'CarCtrl'});
  $routeProvider.when('/car/new', {templateUrl: 'partials/car-form.html', controller: 'CarNewCtrl'});
  $routeProvider.when('/car/:carId/edit', {templateUrl: 'partials/car-form.html', controller: 'CarEditCtrl'});
  
  $routeProvider.when('/driver', {templateUrl: 'partials/driver.html', controller: 'DriverCtrl'});
  $routeProvider.when('/driver/new', {templateUrl: 'partials/driver-form.html', controller: 'DriverNewCtrl'});
  $routeProvider.when('/driver/:driverId/edit', {templateUrl: 'partials/driver-form.html', controller: 'DriverEditCtrl'});
  
  $routeProvider.when('/transportation', {templateUrl: 'partials/transportation.html', controller: 'TransportationCtrl'});
  $routeProvider.when('/transportation/new', {templateUrl: 'partials/transportation-form.html', controller: 'TransportationNewCtrl'});
  $routeProvider.when('/transportation/:transportationId/edit', {templateUrl: 'partials/transportation-form.html', controller: 'TransportationEditCtrl'});
  
  $routeProvider.otherwise({redirectTo: '/car'});
}]);
