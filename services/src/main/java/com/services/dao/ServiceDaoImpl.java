package com.services.dao;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.services.exception.ResourceNotFoundException;
import com.services.model.Services;
import com.services.repository.ServicesRepository;

@Component
@Qualifier("ServiceDao")
public class ServiceDaoImpl implements ServiceDao {
	@Autowired
	public ServicesRepository servicesrepository;

	@Override
	public List<Services> readAllService() {
		return servicesrepository.findAll();
	}

	@Override
	public Services addServices(@Valid Services services) throws ResourceNotFoundException {
		return servicesrepository.save(services);
	}
	
	@Override
	public Optional<Services> readAllServiceBycategory(@PathVariable(value = "categoryid") long categoryid) throws ResourceNotFoundException{
			return servicesrepository.findById(categoryid);
	}

}