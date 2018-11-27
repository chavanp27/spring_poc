package com.pramod.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pramod.productservice.domain.Product;
import com.pramod.productservice.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
	public List getProducts() {
		return productRepository.findAll();
	}
	
	@PostMapping("/products")
	public Product save(@RequestBody Product product) {
		return (Product) productRepository.save(product);
	}

}
