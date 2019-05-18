package com.candidjava.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.candidjava.spring.bean.Brands;
import com.candidjava.spring.bean.Cities;
import com.candidjava.spring.bean.Product_category;

public interface Product_categoryRepository extends MongoRepository<Product_category, String> {
	@Query("{'brand_id': ?0}")
	List<Product_category> findProducts(int brand_id);

}
