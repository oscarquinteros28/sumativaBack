package com.sumativa.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sumativa.models.Producto;

@Repository
public interface ProductosRepository extends CrudRepository<Producto, Long>{
	List<Producto> findAll();

}
