package com.sumativa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumativa.models.Venta;
import com.sumativa.repositories.VentasRepository;

@Service
public class VentaService {

	@Autowired
	VentasRepository ventaRepository;
	
	public List<Venta> allVentas(){
		return ventaRepository.findAll();
	}
	
	public Venta guardarVenta(Venta venta) {
		return ventaRepository.save(venta);
	}
}
