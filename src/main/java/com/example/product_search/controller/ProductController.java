package com.example.product_search.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product_search.service.ProductService;

@RestController
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
	    this.productService = productService;
	}
	
	@GetMapping("/products")
	public List<String> findAll() {
		return 
				productService.findAll();
	}
	
	public List<String> findAll(
		    @RequestParam(name = "keyword", required = )
		    String keyword) {
		return productService.findAll();
	}
	

}
