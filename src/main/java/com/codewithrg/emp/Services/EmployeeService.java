package com.codewithrg.emp.Services;

import com.codewithrg.emp.Entity.Employee;
import com.codewithrg.emp.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repo;

    @Transactional
    public Employee postEmployees(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee updateEmployees(Employee employee) {
        return repo.save(employee);
    }

    public void deleteEmployees(Long id) {
        repo.deleteById(id);
    }
}

