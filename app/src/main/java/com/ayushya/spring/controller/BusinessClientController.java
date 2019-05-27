package com.ayushya.spring.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayushya.spring.bean.BusinessClient;
import com.ayushya.spring.bean.BusinessClientDetails;
import com.ayushya.spring.bean.Employee;
import com.ayushya.spring.bean.States;
import com.ayushya.spring.service.BusinessClientService;
import com.ayushya.spring.service.UserService;


@RestController
public class BusinessClientController {
	
	@Autowired
	BusinessClientService businessClientService;
	
    @GetMapping(value="/getstates", headers="Accept=application/json")
    public BusinessClient createBusinessClient(@RequestBody BusinessClient businessClientReq) {
        BusinessClient businessClient=businessClientService.createBusinessclient(businessClientReq);
        return businessClient;

    }
}
