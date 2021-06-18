package com.service.main.controller;

import com.service.main.model.Employee;
import com.service.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public ResponseEntity<Object> getAllEmployee(){
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("/employee/{employee_id}")
    public ResponseEntity<Object> getEmployeeById(@PathVariable String employee_id) {
        return new ResponseEntity<>(employeeService.getEmployeeById(employee_id), HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/employee/{employee_id}")
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee, @PathVariable String employee_id) {
        employeeService.updateEmployee(employee, employee_id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
