package com.service.main.service;

import com.service.main.dao.EmployeeRepository;
import com.service.main.dto.SalaryDTO;
import com.service.main.model.Employee;
import com.service.main.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeDTO> getAllEmployee() {
        List<EmployeeDTO> employeeDTOList = employeeRepository.findAll().stream()
                .map(e -> new EmployeeDTO(e)).collect(Collectors.toList());;
        return employeeDTOList;
    }

    public EmployeeDTO getEmployeeById(String employee_id) {
        Employee employee = employeeRepository.findById(employee_id).get();
        EmployeeDTO employeeDTO = new EmployeeDTO(employee);
        return employeeDTO;
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
