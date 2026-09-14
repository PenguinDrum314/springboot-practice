package com.example.product_search.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public List<String> findAll() {
		return List.of("pen","notebook","pencil case");
	}
}
