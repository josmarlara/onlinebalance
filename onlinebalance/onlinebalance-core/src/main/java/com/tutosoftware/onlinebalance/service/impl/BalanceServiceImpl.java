package com.tutosoftware.onlinebalance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutosoftware.onlinebalance.dao.BalanceDAO;
import com.tutosoftware.onlinebalance.entity.Movimiento;
import com.tutosoftware.onlinebalance.entity.Saldo;
import com.tutosoftware.onlinebalance.service.BalanceService;


@Service
@Transactional
public class BalanceServiceImpl implements BalanceService {
	
	@Autowired
	BalanceDAO balanceDAO;

	@Override
	public List<Movimiento> obtenerMovimientos(long idTarjeta) {
		// TODO Auto-generated method stub
		return balanceDAO.obtenerMovimientos(idTarjeta);
	}

	@Override
	public Saldo obtenerSaldo(long idTarjeta) {
		// TODO Auto-generated method stub
		return balanceDAO.obtenerSaldo(idTarjeta);
	}

}
