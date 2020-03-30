package com.services.dao;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.services.exception.ResourceNotFoundException;
import com.services.model.Services;

public interface ServiceDao {


	public List<Services> readAllService();

	public Services addServices( @Valid Services services) throws ResourceNotFoundException;
	
	public Optional<Services> readAllServiceBycategory(long categoryid) throws ResourceNotFoundException;


}
