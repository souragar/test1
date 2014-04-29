var myApp = angular.module('bookApp', ['ngRoute']);


myApp.config(function($routeProvider) {
	$routeProvider

		// route for the home page
		/*.when('/', {
			templateUrl : 'index.html',
			
		})*/
		
		.when('/lendrecord', {
			templateUrl : 'lendrecord.html',
			controller  : 'lendCtrl'
		})

		// route for the book page
		.when('/book', {
			templateUrl : 'book.html',
			controller  : 'bookCtrl'
		})

		// route for the contact page
		.when('/person', {
			templateUrl : 'person.html',
			controller  : 'personCtrl'
		});
	
});






myApp.controller('bookCtrl', [
                              
		'$scope',
		'$http',
		function($scope, $http) {
			$http.get('http://localhost:8080/bi-server/api/books').success(
					function(data) {
						$scope.Books = data;
					});

			$scope.removeBook = function(idx) {
				var book_to_delete = $scope.Books[idx];
				
				console.log("deleting ");
				$http({
					method : 'DELETE',
					url : 'http://localhost:8080/bi-server/api/books/'
							+  book_to_delete.id
				}).success(
       					function(data) {
       						$scope.Books.splice(idx, 1);
      						console.log(data);
      					})

			};
			$scope.addItem = function () {
				$scope.author= "";
			    $scope.name= "";

			   

			    // Clear input fields after push
			    

			};
			$scope.push=function()
			{console.log($scope.author);
			var book={
			        author: $scope.author,
			        name: $scope.name
			    };
				 $scope.Books.push(book);
				 $scope.save(book);
				 $('#myModal').modal('hide');
				 
			};
			
			$scope.save = function(book) {
				console.log("adding ");
				$http({
					method : 'POST',
					url : 'http://localhost:8080/bi-server/api/books/',
					data:book		
				})

			};
		
		} ]);
