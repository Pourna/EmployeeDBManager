package com.service.main.dao;

import com.service.main.model.Salary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaryRepository extends CrudRepository<Salary, String> {
    List<Salary> findByEmployeeId(String employee_id);
}
