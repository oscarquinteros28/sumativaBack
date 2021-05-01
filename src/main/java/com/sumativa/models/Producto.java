package com.sumativa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=4,max= 50)
	private String nombre;
	private Integer Precio;
	@Size(min=4,max= 80)
	private String descripcion;
	
	
	
	public Producto() {
		super();
	}
	
	public Producto(@Size(min = 4, max = 50) String nombre, Integer precio,
			@Size(min = 4, max = 80) String descripcion) {
		super();
		this.nombre = nombre;
		Precio = precio;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPrecio() {
		return Precio;
	}
	public void setPrecio(Integer precio) {
		Precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
