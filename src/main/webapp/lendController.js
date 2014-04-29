myApp.controller('lendCtrl', [
                            
                          		'$scope',
                          		'$http',
                          		function($scope, $http) {
                          			$http.get('http://localhost:8080/bi-server/api/lendRecords').success(
                          					function(data) {
                          						$scope.LendRecord = data;
                          						
                          					});
                          			$http.get('http://localhost:8080/bi-server/api/lendRecords/availableBooks').success(
                          					function(data) {
                          						$scope.availableBook = data;
                          					});
                          			$http.get('http://localhost:8080/bi-server/api/person').success(
                          					function(data) {
                          						$scope.Person = data;
                          					});
                          			
                          			$scope.user="";
                          			$scope.searchRecord= function(user) {
                          				console.log(user);
                          				$http({
                          				    url: 'http://localhost:8080/bi-server/api/lendRecords/userRecord/'+user, 
                          				    method: "GET",
                          				   
                          				 }).success(
                               					function(data) {
                              						$scope.userRcrd = data;
                              						console.log(data);
                              					});
                          				
                          				
                          			}

                          			$scope.removeLendRecord = function(idx) {
                          				var lend_to_delete = $scope.LendRecord[idx];
                          				console.log("deleting ");
                          				$http({
                          					method : 'DELETE',
                          					url : 'http://localhost:8080/bi-server/api/lendRecords/'
                          							+ lend_to_delete .id
                          				}).success(
                               					function(data) {
                               						$scope.LendRecord.splice(idx, 1);
                              						console.log(data);
                              					})

                          			};
                          			$scope.addItem = function () {
                          				 $scope.book= "";
                           			    $scope.person= "";
                           			 $scope.date= "";

                          			   

                          			    
                          			   

                          			};
                          			$scope.push=function()
                        			{
                          				var lendRecord={
                        			        book: $scope.book,
                        			        person:$scope.person,
                        			        date: $scope.date
                        			    }
                        			  
                        				 $scope.LendRecord.push(lendRecord);
                        				 $scope.save(lendRecord);
                        				 $('#myModal').modal('hide');
                        				 
                        			};
                          			
                          			$scope.save = function(lendRcrd) {
                          				
                          				console.log(lendRcrd);
                          				$http({
                          					method : 'POST',
                          					url : 'http://localhost:8080/bi-server/api/lendRecords/',
                          					data:lendRcrd		
                          				})

                          			};
                          		
                          		} ]);