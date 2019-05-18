package com.candidjava.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.candidjava.spring.bean.Brands;
import com.candidjava.spring.bean.Cities;

public interface BrandsRepository extends MongoRepository<Brands, String> {

}
