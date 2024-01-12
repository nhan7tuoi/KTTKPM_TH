package com.fit.se.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fit.se.service.ProductService;

@RestController
@RequestMapping("/api/users")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/list")
	public List<Map<String, Object>> getAllUsers(){
		List<Map<String, Object>> userList = productService.getAllUser();
		return userList;
	}
}
