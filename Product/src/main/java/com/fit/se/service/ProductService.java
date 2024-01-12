package com.fit.se.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
	
	private final String urlApi = "http://localhost:8080/users";
	
	private final RestTemplate restTemplate;
	
	@Autowired
	public ProductService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public List<Map<String, Object>> getAllUser(){
		String url = urlApi + "/list";
		ResponseEntity<List<Map<String, Object>>> responseEntity = restTemplate.exchange(
	            url,
	            HttpMethod.GET,
	            null,
	            new ParameterizedTypeReference<List<Map<String, Object>>>() {}
	        );
		return responseEntity.getBody();
	}
	
}
