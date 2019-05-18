package com.candidjava.spring.service;

import java.util.List;

import com.candidjava.spring.bean.Brands;
import com.candidjava.spring.bean.Cities;
import com.candidjava.spring.bean.Employee;
import com.candidjava.spring.bean.Models;
import com.candidjava.spring.bean.Product_category;
import com.candidjava.spring.bean.States;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
	public void createUser(Employee user);
	public List<Employee> getUser();
	public Employee findById(String id);
	public Employee update(Employee user, String l);
	public void deleteUserById(String id);
	public Employee updatePartially(Employee user, String id);

	public String uploadImage(MultipartFile uploadfile);

	public List<Cities> getCityByState(int id);
	public List<Cities> getCities();
	public Cities getCityById(String id);

	public List<States> getStates();

	public List<Employee> findByName(String name);
	public List<Employee> findByNameStartingWith(String regexp);
	public List<Employee> findByNameEndingWith(String regexp);
	public List<Employee> findByAgeBetween(int ageGT, int ageLT);
	
	public List<Brands> getBrands();
	public List<Product_category> getProducts();
	public List<Product_category> getProducts(int brand_id);
	public List<Models> getModels();
	public List<Models> getModels(int brand_id,int product_id);
}
