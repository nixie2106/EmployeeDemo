package com.company.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.company.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
