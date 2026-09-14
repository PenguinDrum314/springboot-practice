package com.example.product_search.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	private final ProductService search();

	public ProductController(ProductService productService) {
	    this.search() = List<String>;
	}
	
	@GetMapping("/products")
	public List<String> findAll() {
		return 
				productService.findAll();
	}
	

}
