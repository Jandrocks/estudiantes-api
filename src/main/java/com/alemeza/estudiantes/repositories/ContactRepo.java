package com.alemeza.estudiantes.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alemeza.estudiantes.models.ContactModel;

public interface ContactRepo extends CrudRepository<ContactModel, Long>{
	
}
