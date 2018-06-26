package com.tutosoftware.onlinebalance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="saldo")
@ApiModel(value = "Saldo entidad", description = "Datos completos de la entidad saldo")
public class Saldo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@ApiModelProperty(value = "Número de tarjeta", required = true)
	private Long IdTarjeta;
	
	@Column
	@ApiModelProperty(value = "Cantidad del saldo actual", required = true)
	private Double Saldo;
	
	public Saldo(){
		
	}

	public Long getIdTarjeta() {
		return IdTarjeta;
	}

	public void setIdTarjeta(Long idTarjeta) {
		IdTarjeta = idTarjeta;
	}

	public Double getSaldo() {
		return Saldo;
	}

	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}

}
