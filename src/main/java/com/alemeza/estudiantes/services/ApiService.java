package com.alemeza.estudiantes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alemeza.estudiantes.models.ContactModel;
import com.alemeza.estudiantes.models.StudentModel;
import com.alemeza.estudiantes.repositories.ContactRepo;
import com.alemeza.estudiantes.repositories.StudentRepo;

@Service
public class ApiService {

	@Autowired
	private ContactRepo contactRepo;
	@Autowired
	private StudentRepo studentRepo;
	
	//STUDENT
		public List<StudentModel> mostrarTodos(){
			return studentRepo.findAll();	
		}
		public StudentModel createStudent(StudentModel s) {
			return studentRepo.save(s);
		} 
		public List<StudentModel> findByNoContact() {
			return studentRepo.findByNoContact();
		}

		//CONTACT
		public ContactModel createContact(ContactModel c) {
			return contactRepo.save(c);
		}
}