package com.aryausha.Employee.controller;

import com.aryausha.Employee.model.Employee;
import com.aryausha.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeRepository repos;

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to this page";
    }

    @PostMapping("/addemployee")
    public String addemployee(@RequestBody Employee e){
        repos.insert(e);
        return "success";
    }
    @GetMapping("/hi")
    public String hi()
    {
        return "hi";
    }
    @GetMapping("/viewdetails")
    public List<Employee> viewdetails()
    {
        return repos.findAll();
    }
}
