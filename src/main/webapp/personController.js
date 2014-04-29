myApp.controller('personCtrl', [
                              
                      		'$scope',
                      		'$http',
                      		function($scope, $http) {
                      			$http.get('http://localhost:8080/bi-server/api/person').success(
                      					function(data) {
                      						$scope.Person = data;
                      					});

                      			$scope.removePerson = function(idx) {
                      				var person_to_delete = $scope.Person[idx];
                      				console.log("deleting ");
                      				$http({
                      					method : 'DELETE',
                      					url : 'http://localhost:8080/bi-server/api/person/'
                      							+ person_to_delete.id
                      				}).success(
                           					function(data) {
                           						$scope.Person.splice(idx, 1);
                          						console.log(data);
                          					})

                    			};

                      			
                      			
                      			
                      			$scope.addItem = function () {

                      			   
                      			    
                      			    $scope.name= "";
                      			    $scope.age= "";
                      			    

                      			};
                      			$scope.push=function()
                    			{var person={
                    			        age: $scope.age,
                    			        name: $scope.name
                    			    }
                    			  
                    				 $scope.Person.push(person);
                    				 $scope.save(person);
                    				 $('#myModal').modal('hide');
                    				 
                    			};
                      			$scope.save = function(person) {
                      				console.log("adding ");
                      				$http({
                      					method : 'POST',
                      					url : 'http://localhost:8080/bi-server/api/person/',
                      					data:person		
                      				})

                      			};
                      		
                      		} ]);