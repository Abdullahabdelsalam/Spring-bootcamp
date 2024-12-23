package com.springbootcamp.employeemvccrud.service;

import com.springbootcamp.employeemvccrud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
