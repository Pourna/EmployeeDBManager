package com.service.main.service;


import com.service.main.dao.EmployeeRepository;
import com.service.main.dao.SalaryRepository;
import com.service.main.model.Employee;
import com.service.main.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalaryService {

    @Autowired
    private SalaryRepository salaryRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addSalary(Salary salary, String employee_id) {
        Employee employee = employeeRepository.getOne(employee_id);
        salary.setEmployee(employee);
        Double total = salary.getBasic() + salary.getBonus() + salary.getHra();
        salary.setTotal(total);
        salaryRepository.save(salary);
    }

    public List<Salary> getAllSalaryByEmployeeId(String employee_id) {
        List<Salary> salaries = new ArrayList<>();
        salaryRepository.findByEmployeeId(employee_id).forEach(salaries::add);
        return salaries;
    }
}
