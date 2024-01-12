package com.fit.se.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fit.se.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
