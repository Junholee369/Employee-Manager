package com.javaprojects.employee_management.service;

import java.util.List;

import com.javaprojects.employee_management.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
