package com.codewithrg.emp.Controller;

import com.codewithrg.emp.Entity.Employee;
import com.codewithrg.emp.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService eservice;


    @PostMapping("/create")
    public Employee postEmployee(@RequestBody Employee employee){

        return eservice.postEmployees(employee);

    }
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return eservice.getAllEmployees();
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){

        return eservice.updateEmployees(employee);

    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
        eservice.deleteEmployees(id);
         return ResponseEntity.ok("User deleted successfully");


    }

}
