package com.service.main.controller;

import com.service.main.model.Salary;
import com.service.main.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping("employee/{employee_id}/salary")
    public ResponseEntity<Object> getAllSalary(@PathVariable String employee_id) {
        return new ResponseEntity<>(salaryService.getAllSalaryByEmployeeId(employee_id), HttpStatus.OK);
    }

    @PostMapping("employee/{employee_id}/salary")
    public void addSalary(@RequestBody Salary salary, @PathVariable String employee_id){
        salaryService.addSalary(salary, employee_id);
    }
}
