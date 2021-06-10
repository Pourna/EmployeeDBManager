package com.service.main.controller;

import com.service.main.model.Salary;
import com.service.main.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @RequestMapping("employee/{employee_id}/salary")
    public List<Salary> getAllSalary(@PathVariable String employee_id) {
        return salaryService.getAllSalaryByEmployeeId(employee_id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "employee/{employee_id}/salary")
    public void addSalary(@RequestBody Salary salary, @PathVariable String employee_id){
        salaryService.addSalary(salary, employee_id);
    }
}
