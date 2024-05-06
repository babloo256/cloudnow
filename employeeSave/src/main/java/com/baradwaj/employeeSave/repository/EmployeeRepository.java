package com.baradwaj.employeeSave.repository;

import com.baradwaj.employeeSave.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
