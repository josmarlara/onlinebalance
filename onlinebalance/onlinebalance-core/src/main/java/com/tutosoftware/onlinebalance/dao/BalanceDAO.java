package com.tutosoftware.onlinebalance.dao;

import java.util.List;

import com.tutosoftware.onlinebalance.entity.Movimiento;
import com.tutosoftware.onlinebalance.entity.Saldo;



public interface BalanceDAO {
	
	public List<Movimiento> obtenerMovimientos(long idTarjeta);
	public Saldo obtenerSaldo(long idTarjeta);

}
