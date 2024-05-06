package com.baradwaj.employeeSave.controller;

import com.baradwaj.employeeSave.entity.Employee;
import com.baradwaj.employeeSave.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("save")
    public String saveEmployee(@RequestBody Employee employee){
        Employee savedEmployee = this.employeeService.save(employee);
        return savedEmployee.toString();
    }
}
