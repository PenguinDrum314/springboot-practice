package com.example.product_search.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/prodcuts/search")
	public String search(@RequestParam("keyword") String keyword) {
		return "検索キーワード" + keyword;
	}
	

}
