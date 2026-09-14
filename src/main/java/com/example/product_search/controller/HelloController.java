package com.example.product_search.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//NOTE: @RestController ＝文字・JSONなどの「データ」を直接返す
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Spring Boot 起動成功！";
	}

}
