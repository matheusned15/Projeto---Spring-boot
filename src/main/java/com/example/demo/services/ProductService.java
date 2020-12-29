package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepositoy;

@Service
public class ProductService {

	@Autowired
	private ProductRepositoy productRepositoy;

	public List<Product> findall() {
		return productRepositoy.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = productRepositoy.findById(id);
		return obj.get();
	}

}
