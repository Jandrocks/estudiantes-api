package com.alemeza.estudiantes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alemeza.estudiantes.models.ContactModel;
import com.alemeza.estudiantes.models.StudentModel;
import com.alemeza.estudiantes.services.ApiService;

@RestController
public class ApiController {
	@Autowired
	private ApiService apiServ;
	
	@PostMapping("/student/create")
	public StudentModel createStudent(@RequestParam(value = "firstName") String firstName,
			@RequestParam(value = "lastName") String lastName, @RequestParam(value="age") int age) {
		
		StudentModel newStudent = new StudentModel(firstName, lastName, age);
		return apiServ.createStudent(newStudent);
	}

	@PostMapping("/contacts/create")
	public ContactModel createContact(@RequestParam(value = "address") String address,
			@RequestParam(value = "city") String city, @RequestParam(value="state") String state,
			@RequestParam(value= "student") StudentModel student) {
		ContactModel newcontact = new ContactModel(address, city, state, student);
		return apiServ.createContact(newcontact);
	}
	
	@GetMapping("/showStudents")
	public List<StudentModel> mostrarTodos() {
		return	apiServ.mostrarTodos();
	}
}
