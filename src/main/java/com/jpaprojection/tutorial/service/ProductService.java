package com.jpaprojection.tutorial.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpaprojection.tutorial.projection.ProductProjection;
import com.jpaprojection.tutorial.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Collection<ProductProjection> getProducts() {
		
		return productRepository.findSelectedFields();
	}

}
