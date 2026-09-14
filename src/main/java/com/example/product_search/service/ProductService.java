package com.example.product_search.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public String search(String keyword) {
		return "検索キーワード" + keyword;
	}
}
