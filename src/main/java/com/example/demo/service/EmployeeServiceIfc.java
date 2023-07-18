package com.example.demo.service;

import java.util.List;

import com.example.demo.apiuResponce.ApiResponce;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;

public interface EmployeeServiceIfc {

	ApiResponce addEmployee(EmployeeDto employeeDto);

	ApiResponce getAll();

	ApiResponce getById(String id);
	
	ApiResponce getByName(String name);
	ApiResponce getByEmail(String email);

	ApiResponce updateEmployee(String id,EmployeeDto employeeDto);

	ApiResponce delete(String id);
	
	default ApiResponce add(){
		return null;
		
	}
}
