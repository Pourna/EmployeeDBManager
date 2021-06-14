package com.service.main.controller;

import com.service.main.model.Employee;
import com.service.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @RequestMapping("/employee/{employee_id}")
    public Optional<Employee> getEmployeeById(@PathVariable String employee_id) {
        return employeeService.getEmployeeById(employee_id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employee")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employee/{employee_id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable String employee_id) {
        employeeService.updateEmployee(employee, employee_id);
    }
}
