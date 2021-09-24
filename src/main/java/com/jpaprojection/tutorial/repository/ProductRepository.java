package com.jpaprojection.tutorial.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpaprojection.tutorial.model.Product;
import com.jpaprojection.tutorial.projection.ProductProjection;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	//defining out projection method using class projection
	@Query("SELECT new com.jpaprojection.tutorial.projection.ProductProjection(p.productName, p.category, p.price) FROM Product AS p")
	public Collection<ProductProjection> findSelectedFields();

}
