'use strict';

/* Controllers */

angular.module('myApp.transportation', [])
  .controller('TransportationCtrl', ['$scope', '$http', '$location', function($scope, $http, $location) {
     $http.get('/exam/transportation').success(function(data) {
    	 $scope.transportations = data;
    });
     $scope.deleteTransportation = function(transportationId) {
    	 $http['delete']('/exam/transportation/' + transportationId)
    	 .success(function(data, status, headers, config) {
    		 $location.path('/transportation');
    	 })
    	 .error(function(data, status, headers, config) {
    		 $location.path('/transportation');
    	 });
     };
  }])
  .controller('TransportationNewCtrl', ['$scope', '$http', '$location', function($scope, $http, $location) {
	$scope.transportationForm = {};

	$http.get('/exam/car').success(function(data) {
   	 $scope.cars = data;
	});
	
    $scope.submitTransportationForm = function(item, event) {
      console.log("--> Submitting the transportationForm");
      
      function postTransportation(car) {
    	  var transportationObject = {
    	           id : $scope.transportationForm.id,
    	           origin  : $scope.transportationForm.origin,
    	           startDate : $scope.transportationForm.startDate,
    	           destination : $scope.transportationForm.destination,
    	           arrivalDate : $scope.transportationForm.arrivalDate,
    	           distance : $scope.transportationForm.distance,
    	           totalTime : $scope.transportationForm.totalTime,
                  cargoWeight : $scope.transportationForm.cargoWeight,
                  fuelUsed : $scope.transportationForm.fuelUsed,
    	           car : car
    	        };
    	   $http.post("/exam/transportation", transportationObject)
            .success(function(dataFromServer, status, headers, config) {
              $location.path('/transportation');
            })
            .error(function(data, status, headers, config) {
              alert("Submitting form failed!");
            });
      }
      
      if ($scope.transportationForm.car && $scope.transportationForm.car.number) {
    	  console.log("Trying to get a car with id: " + $scope.transportationForm.car.number);
    	  $http.get('/exam/car/' + $scope.transportationForm.car.number)
    	  .success(function(carData) {
    		  postTransportation(carData);
     	   }).error (function(data) {
     		   alert("Submitting form failed!");
     	   });
     		   
      } else {
    	  postTransportation(null);
      }
      
    };
  }])
  .controller('TransportationEditCtrl', ['$scope', '$http', '$routeParams', '$location', function($scope, $http, $routeParams, $location) {
	$scope.transportationForm = {};

	$http.get('/exam/car').success(function(data) {
	   	 $scope.cars = data;
	});
	
	$http.get('/exam/transportation/' + $routeParams.transportationId).success(function(data) {
   	 $scope.transportationForm = data;
    });
	
    $scope.submitTransportationForm = function(item, event) {
      console.log("--> Submitting the transportationForm");
      
      function putTransportation(car) {
    	  var transportationObject = {
    		        id : $scope.transportationForm.id,
    		    	origin  : $scope.transportationForm.origin,
    		    	startDate : $scope.transportationForm.startDate,
    		    	destination : $scope.transportationForm.destination,
    		    	arrivalDate : $scope.transportationForm.arrivalDate,
    		    	distance : $scope.transportationForm.distance,
    		    	totalTime : $scope.transportationForm.totalTime,
    		    	cargoWeight : $scope.transportationForm.cargoWeight,
    		    	fuelUsed : $scope.transportationForm.fuelUsed,
    		    	car : car
    		      };

    		      $http.put("/exam/transportation/" + transportationObject.id, transportationObject)
  		      	.success(function(dataFromServer, status, headers, config) {
  		              $location.path('/transportation');
  	            })
  		      	.error(function(data, status, headers, config) {
  		      		alert("Submitting form failed!");
  		      	});
      }
      
      if ($scope.transportationForm.car && $scope.transportationForm.car.number) {
    	  $http.get('/exam/car/' + $scope.transportationForm.car.number)
    	  .success(function(carData) {
    		  putTransportation(carData);
    	  })
    	  .error (function(data) {
    		  alert("Submitting form failed!");
    	  });
      } else {
    	  putTransportation(null);
      }
     
    };
  }]);
