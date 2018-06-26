package com.tutosoftware.onlinebalance.service;

import java.util.List;

import com.tutosoftware.onlinebalance.entity.Movimiento;
import com.tutosoftware.onlinebalance.entity.Saldo;



public interface BalanceService {
	
	public List<Movimiento> obtenerMovimientos(long idTarjeta);
	public Saldo obtenerSaldo(long idTarjeta);

}
