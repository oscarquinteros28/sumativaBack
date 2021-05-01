package com.sumativa.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sumativa.models.Venta;

@Repository
public interface VentasRepository extends CrudRepository<Venta, Long>{

	List<Venta> findAll();

}
