package com.service.main.dao;

import com.service.main.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
//    Optional<Employee> findById(String employee_id);
}
