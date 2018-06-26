<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html ng-app='myApp'>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


 
<title>OnlineBalance cliente</title>
   
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
      <link href="css/app.css" rel="stylesheet"></link>
</head>

<body ng-app='myApp' ng-controller="onlineBalanceController">
   <div class="generic-container">


<h3>Consulta tu saldo o movimientos</h3>
<p>
Introduce los 16 dígitos de tu tarjeta.
</p>
 <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">Online Balance </span></div>
<div class="form">

			<label for="idTarjeta">Número de tarjeta:</label>
			
				<input type="text" id="idTarjeta"  ng-model="idTarjeta" placeholder="idTarjeta" maxlength="16" size="16">
				
			

<input type="submit"  value="Obtener Movimientos" class="btn btn-primary btn-sm" ng-click="obtenerMovimientos()" />
				
<input type="submit"  value="Obtener Saldo" class="btn btn-primary btn-sm" ng-click="obtenerSaldo()">
				
</div>
</div>
<div ng-if="movimientos.exist==1">
		
		<div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">Lista de movimientos </span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>Número de movimiento</th>
                              <th>ID tarjeta</th>
                              <th>Movimiento</th>
                              <th>Cantidad</th>
                              
                          </tr>
                      </thead>
                      <tbody>
                          <tr ng-repeat="p in movimientos">
                              <td>{{p.idMovimiento}}</td>
                              <td>{{p.idTarjeta}}</td>
                              <td>{{p.movimiento}}</td>
                              <td>{{p.cantidad}}</td>
                              
                          </tr>
                      </tbody>
                  </table>
              </div>
          </div>
		
		
		
		
		
		
		
	</div>
	<div ng-if="saldo.exist==1">
		<h1>Saldo</h1>
		<pre>
			<h5> ID Tarjeta: {{saldo.idTarjeta}}</h5>
			<h2> Cantidad: {{saldo.saldo}}</h2>
		</pre>
		<hr/>
	</div>


</div>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script type="text/javascript" src="js/service/onlineBalanceService.js"></script>
     <script type="text/javascript" src="js/controller/onlineBalanceController.js"></script>
	<!--Services-->
	





</body>
</html>