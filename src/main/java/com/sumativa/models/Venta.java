package com.sumativa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="ventas")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=4,max= 50)
	private String producto;
	private Integer cantidad;
	private Integer precio;
	private Integer total;
	
	
	public Venta() {
		super();
	}
	
	public Venta(@Size(min = 4, max = 50) String producto, Integer cantidad, Integer precio, Integer total) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
