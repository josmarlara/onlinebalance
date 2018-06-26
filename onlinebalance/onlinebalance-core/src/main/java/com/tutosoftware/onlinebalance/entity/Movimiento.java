package com.tutosoftware.onlinebalance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="movimiento")
@ApiModel(value = "Movimiento entidad", description = "Datos completos de la entidad movimiento")
public class Movimiento implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(value = "El id del movimiento", required = true)
	private Long idMovimiento;
	
	@Column
	@ApiModelProperty(value = "Número de tarjeta", required = true)
	private Long idTarjeta;
	
	
	@Column
	@ApiModelProperty(value = "Donde se realizo el movimiento", required = true)
	private String movimiento;
	
	
	@Column
	@ApiModelProperty(value = "Cantidad númerica del movimiento", required = true)
	private Double cantidad;
	
	
    public Movimiento(){}


	public Long getIdMovimiento() {
		return idMovimiento;
	}


	public void setIdMovimiento(Long idMovimiento) {
		this.idMovimiento = idMovimiento;
	}


	public Long getIdTarjeta() {
		return idTarjeta;
	}


	public void setIdTarjeta(Long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}


	public String getMovimiento() {
		return movimiento;
	}


	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}


	public Double getCantidad() {
		return cantidad;
	}


	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

}
