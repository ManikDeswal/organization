package com.company.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @GetMapping
    public List<Employee> getAllEmployees(){
       return employeeRepository.findAll();
    }

    @PostMapping
    public Employee addEmployee(Employee employee){
        System.out.println("Received employee: " + employee);
        return employeeRepository.save(employee);
    }
}
