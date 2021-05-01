package com.sumativa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumativa.models.Producto;
import com.sumativa.repositories.ProductosRepository;

@Service
public class ProductoService {
	@Autowired
	ProductosRepository productosRepository;
	
	public Producto guardarProducto(Producto producto) {
		return productosRepository.save(producto);
	}

	public List<Producto> allProductos() {
		return productosRepository.findAll();
	}

}
