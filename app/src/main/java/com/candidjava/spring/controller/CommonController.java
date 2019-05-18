package com.candidjava.spring.controller;


import com.candidjava.spring.bean.Brands;
import com.candidjava.spring.bean.Cities;

import com.candidjava.spring.bean.Employee;
import com.candidjava.spring.bean.Models;
import com.candidjava.spring.bean.Product_category;
import com.candidjava.spring.bean.States;
import com.candidjava.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value={"/","/utils"})
public class CommonController {
	

    @Autowired
    UserService userService;
	


    /*
      Api name: Get all states
      Parameters: N/A
  	*/
    @GetMapping(value="/getstates", headers="Accept=application/json")
    public List<States> getAllState() {
        List<States> tasks=userService.getStates();
        return tasks;

    }

    /*
      Api name: Get all Cities
      Parameters: N/A
  	*/
    @GetMapping(value="/getAllcity", headers="Accept=application/json")
    public List<Cities> getAllCity() {
        List<Cities> tasks=userService.getCities();
        return tasks;

    }

    /*
      Api name: Get city by state id
      Parameters: id
  	*/
    @GetMapping(value="/{id}/getcity", headers="Accept=application/json")
    public List<Cities> getAllCity(@PathVariable("id") int stateId) {
        try{
            List<Cities> tasks=userService.getCityByState(stateId);
            //List<Cities> tasks=userService.getCities();
            return tasks;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    /*
    Api name: Get all brands
    Parameters: N/A
	*/
  @GetMapping(value="/brands", headers="Accept=application/json")
  public List<Brands> getAllBrands() {
      List<Brands>brands=userService.getBrands();
      return brands;
  }
  
  @GetMapping(value="/brands/{brand_id}/products/{product_id}/models", headers="Accept=application/json")
  public List<Models> getAllModelsById(@PathVariable("brand_id") int brand_id,@PathVariable("product_id") int product_id) {
      List<Models> models=userService.getModels(brand_id,product_id);
      return models;
  }
  
  @GetMapping(value="/models", headers="Accept=application/json")
  public List<Models> getAllModels() {
      List<Models> models=userService.getModels();
      return models;
  }
  
  @GetMapping(value="/brands/{brand_id}/products", headers="Accept=application/json")
  public List<Product_category> getAllProductsCategoryById(@PathVariable("brand_id") int brand_id) {
	  List<Product_category> product_category=userService.getProducts(brand_id);
      return product_category;
  }
  
  @GetMapping(value="/products", headers="Accept=application/json")
  public List<Product_category> getProductCategory() {
      List<Product_category> product_category=userService.getProducts();
      return product_category;

  }
}
