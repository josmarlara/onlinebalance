/**
 * 
 */
angular.module('myApp', ['onlineBalanceService']);
 
angular.module('myApp').controller('onlineBalanceController', ['$scope','balanceRequest',onlineBalanceController]);
function onlineBalanceController($scope, balanceRequest) {
	$scope.movimientos={};
	$scope.obtenerMovimientos = function(){
		balanceRequest.movimientos($scope.idTarjeta).success(function (data){
			$scope.movimientos=data; // Asignaremos los datos de todos los movimientos
			$scope.movimientos.exist=1;
			$scope.saldo.exist=0;
			
		});
	}
	$scope.obtenerSaldo = function(){
		$scope.saldo={};
		balanceRequest.saldo($scope.idTarjeta).success(function (data){
			$scope.saldo=data; // Asignaremos los datos del saldo
			$scope.saldo.exist=1;
			$scope.movimientos.exist=0;
		});
	}
}