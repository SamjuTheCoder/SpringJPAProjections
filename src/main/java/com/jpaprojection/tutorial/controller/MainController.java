package com.jpaprojection.tutorial.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpaprojection.tutorial.projection.ProductProjection;
import com.jpaprojection.tutorial.service.ProductService;

@RestController
public class MainController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("api/v1/display-some") // we are going to use postman to test our api. lets recompiled
	public Collection<ProductProjection> display() {
		
		return productService.getProducts();
		
	}
	
	//Thank you for watching. Please subscribe, like and comment.

}
