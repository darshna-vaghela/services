package com.services.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.dao.ServiceDao;
import com.services.exception.ResourceNotFoundException;
import com.services.model.Services;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/services")
public class ServiceController {

	@Autowired
	private ServiceDao servicedao;

	// services

	@GetMapping("/")
	@ApiOperation(value = "", notes = "Gets all services category")
	public List<Services> getAllServices() {
		return servicedao.readAllService();
	}

	@PostMapping("/")
	@ApiOperation(value = "", notes = "insert service category")
	public Services createServices(@Valid Services service) throws ResourceNotFoundException {
		return servicedao.addServices(service);
	}

	@GetMapping("/{categoryid}")
	@ApiOperation(value = "", notes = "number of services based on category")
	public Optional<Services> getAllServiceByCategory(@PathVariable(value = "categoryid") long categoryid) throws ResourceNotFoundException {
		return servicedao.readAllServiceBycategory(categoryid);
	}
	
}