package com.service.main.service;

import com.service.main.dao.EmployeeRepository;
import com.service.main.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public Optional<Employee> getEmployeeById(String employee_id) {
        return employeeRepository.findById(employee_id);
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee, String employee_id) {
        Optional<Employee> updateEmp = employeeRepository.findById(employee_id);
        if(Objects.nonNull(updateEmp)) {
            employee.setId(updateEmp.get().getId());
            employeeRepository.save(employee);
        }
    }
}
