'use strict';

/* Controllers */

angular.module('myApp.car', [])
  .controller('CarCtrl', ['$scope', '$http', '$location', function($scope, $http, $location) {
	  console.log("Creating CarCtrl");
     $http.get('/exam/car').success(function(data) {
    	 $scope.cars = data;
    });
     $scope.deleteCar = function(carId) {
    	 $http['delete']('/exam/car/' + carId)
    	 .success(function(data) {
    		 $location.path('/car');
    	 })
    	 .error(function(data) {
    		 $location.path('/car');
    	 });
     };
  }])
  .controller('CarNewCtrl', ['$scope', '$http', '$location', function($scope, $http, $location) {
	$scope.carForm = {};

    $scope.submitCarForm = function(item, event) {
      console.log("--> Submitting the carForm");
      var carObject = {
         number : $scope.carForm.number,
         brand  : $scope.carForm.brand,
         status : $scope.carForm.status,
         location : $scope.carForm.location,
         averageSpeed : $scope.carForm.averageSpeed,
         carryingCapacity : $scope.carForm.carryingCapacity,
         fuelConsumption : $scope.carForm.fuelConsumption
      };

      var responsePromise = $http.post("/exam/car", carObject);
      responsePromise.success(function(dataFromServer, status, headers, config) {
    	  $location.path('/car');
      });
       responsePromise.error(function(data, status, headers, config) {
         alert("Submitting form failed!");
      });
    };
  }])
  .controller('CarEditCtrl', ['$scope', '$http', '$routeParams', '$location', function($scope, $http, $routeParams, $location) {
	$scope.carForm = {};

	$http.get('/exam/car/' + $routeParams.carId).success(function(data) {
   	 $scope.carForm = data;
    });
	
    $scope.submitCarForm = function(item, event) {
      console.log("--> Submitting the carForm");
      var carObject = {
        number : $scope.carForm.number,
    	brand  : $scope.carForm.brand,
    	status : $scope.carForm.status,
    	location : $scope.carForm.location,
    	averageSpeed : $scope.carForm.averageSpeed,
    	carryingCapacity : $scope.carForm.carryingCapacity,
    	fuelConsumption : $scope.carForm.fuelConsumption
      };

      $http.put("/exam/car/" + carObject.number, carObject).success($location.path('/car'));
    };
  }]);
