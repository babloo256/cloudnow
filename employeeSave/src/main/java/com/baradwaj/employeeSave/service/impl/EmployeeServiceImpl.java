package com.baradwaj.employeeSave.service.impl;

import com.baradwaj.employeeSave.entity.Employee;
import com.baradwaj.employeeSave.repository.EmployeeRepository;
import com.baradwaj.employeeSave.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public Employee save(Employee employee) {
        return this.employeeRepository.save(employee);
    }
}
