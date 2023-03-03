package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repositories.StudentRepo;

@Service
public class ApiService {
	@Autowired
	StudentRepo srepo;
	
	public String updateDetails(Student s) {
		srepo.saveAndFlush(s);
		return "Data updated";
	}
	
	public String Delete(int id) {
		srepo.deleteById(id);
		return "Data deleted";
	}

}
