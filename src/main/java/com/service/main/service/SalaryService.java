package com.service.main.service;


import com.service.main.dao.EmployeeRepository;
import com.service.main.dao.SalaryRepository;
import com.service.main.model.Employee;
import com.service.main.model.Salary;
import com.service.main.dto.SalaryDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

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
        calculateMonthAndYear(salary, salary.getCreditedDate());
        salaryRepository.save(salary);
    }

    public List<SalaryDTO> getAllSalaryByEmployeeId(String employee_id) {
        List<Salary> salaryList = salaryRepository.findByEmployeeId(employee_id);
        ModelMapper modelMapper = new ModelMapper();
        List<SalaryDTO> salaries = salaryList
                .stream()
                .map(user -> modelMapper.map(user, SalaryDTO.class))
                .collect(Collectors.toList());
        return salaries;
    }

    private void calculateMonthAndYear(Salary salary, Date creditDate) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Colombo"));
        cal.setTime(creditDate);

        //Set year from the salary credited date
        int year = cal.get(Calendar.YEAR);
        salary.setYear(year);

        //Set month from the salary credited date
        Month month = Month.of(cal.get(Calendar.MONTH)+1);
        salary.setMonth(month.name());
    }
}
