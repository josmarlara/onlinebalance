package com.tutosoftware.onlinebalance.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutosoftware.onlinebalance.dao.BalanceDAO;
import com.tutosoftware.onlinebalance.entity.Movimiento;
import com.tutosoftware.onlinebalance.entity.Saldo;
import com.tutosoftware.onlinebalance.util.HibernateUtil;



@Repository
public class BalanceDAOImpl implements BalanceDAO {
	
	@Autowired
	  private HibernateUtil hibernateUtil;
	
	public BalanceDAOImpl(){
		 
	 }

	@Override
	public List<Movimiento> obtenerMovimientos(long idTarjeta) {
		// TODO Auto-generated method stub
		String hql = " FROM Movimiento m WHERE m.idTarjeta ="+idTarjeta;
		return hibernateUtil.fetchAll(hql);
	}

	@Override
	public Saldo obtenerSaldo(long idTarjeta) {
		// TODO Auto-generated method stub
		
		return hibernateUtil.fetchById(idTarjeta,Saldo.class);
	}

}
