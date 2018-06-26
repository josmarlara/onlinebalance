/**
 * 
 */

angular.module('onlineBalanceService', [])//Declaramos el modulo
	.factory('balanceRequest', function($http) { //declaramos la factory
		var path = "http://localhost:8080/onlinebalanceservice/";//API path
		
		return {
			//Login
			movimientos : function(id){ //Retornara la lista de posts
				global = $http.get(path+'movimientos/'+id);
				return global;
			},
			saldo : function(id){ //retornara el post por el id
				global = $http.get(path+'saldo/'+id);
				return global;	
			}	
		}
	});