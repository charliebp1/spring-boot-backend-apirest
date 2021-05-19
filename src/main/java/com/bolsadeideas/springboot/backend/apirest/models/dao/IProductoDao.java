package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

	
	// tres maneras de hacer una consulta Sql, con la anotación @Query, y con notación Spring Data JPA
	// Que contenga term
	@Query("select p from Producto p where p.nombre like %?1%")
	public List<Producto> findByNombre(String term);
	
	// Que contenga term ignore case
	public List<Producto> findByNombreContainingIgnoreCase(String term);
	
	// Que empiece con term ignore case
	public List<Producto> findByNombreStartingWithIgnoreCase(String term);
}
