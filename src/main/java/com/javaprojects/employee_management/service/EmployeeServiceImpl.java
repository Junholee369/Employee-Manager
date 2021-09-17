package com.javaprojects.employee_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprojects.employee_management.model.Employee;
import com.javaprojects.employee_management.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // get All Employees Method
    @Override
    public List<Employee> getAllEmployees() {
	return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
	this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
	// Optional container object may or may not contain a non-null value

	Optional<Employee> optional = employeeRepository.findById(id);
	Employee employee = null;

	// If a value is present, isPresent() will return true and get() will return the
	// value.
	if (optional.isPresent()) {
	    employee = optional.get();
	} else {
	    throw new RuntimeException("Employee not found for id: " + "id");
	}
	return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
	this.employeeRepository.deleteById(id);

    }

}
