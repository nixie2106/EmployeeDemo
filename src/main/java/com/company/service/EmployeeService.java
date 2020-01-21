package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.model.Employee;
import com.company.respository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepository;
	
	public void saveEmployee(Employee emp) {
		
		//empRepository.save(emp);
		
	}

}
