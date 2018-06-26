package com.tutosoftware.onlinebalance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tutosoftware.onlinebalance.entity.Movimiento;
import com.tutosoftware.onlinebalance.entity.Saldo;
import com.tutosoftware.onlinebalance.service.BalanceService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "testbalance", description = "OnlineBalance API", produces = "application/json")
public class BalanceRestController {
	@Autowired
	private BalanceService balanceService;
	
	
	@RequestMapping(value = {"/"},method = RequestMethod.GET)
    public String bienvenido() {//Welcome page, non-rest
		String mensaje ="<h1>Bienvenido para probar los servicios rest</h1>"; 
		       mensaje +="<h2>/movimientos/idTarjeta</h2>";
		       mensaje +="<h2>/saldo/idTarjeta</h2>";
		       mensaje +="<h2>las tarjetas que puedes probar son</h2>";
		       mensaje +="<h2>1234567890123456</h2>";
		       mensaje +="<h2>1234123456785678</h2>";
		       mensaje +="<h2>1111222233334444</h2>";
        return mensaje;
    }
	
	 @RequestMapping(value="/movimientos/{idTarjeta}",method = RequestMethod.GET)
	 @ApiOperation(value = "Obtener movimientos", notes = "Retorna los movimientos de la tarjeta")
	 public List<Movimiento> obtenerMovimentos(@ApiParam( value = "Meter el BIN o Número de tarjeta 16 digitos")
	 @PathVariable long idTarjeta){
		
		 List<Movimiento> movimientoList = balanceService.obtenerMovimientos(idTarjeta);
		 
		 return movimientoList;
		 
	 }
	 
	 
	 @RequestMapping(value="/saldo/{idTarjeta}",method = RequestMethod.GET)
	 @ApiOperation(value = "Obtener saldo", notes = "Retorna el saldo actual de la tarjeta")
	 public Saldo obtenerSaldo(@ApiParam( value = "Meter el BIN o Número de tarjeta 16 digitos")
	 @PathVariable long idTarjeta){
		 
		 Saldo saldo = balanceService.obtenerSaldo(idTarjeta);
		 
		 return saldo;
		 
	 }
	 

}
