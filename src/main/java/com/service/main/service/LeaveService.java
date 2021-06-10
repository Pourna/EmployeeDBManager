package com.service.main.service;

import com.service.main.dao.EmployeeRepository;
import com.service.main.dao.LeaveRepository;
import com.service.main.model.Employee;
import com.service.main.model.Leaves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeaveService {

    @Autowired
    private LeaveRepository leaveRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addLeaves(Leaves leaves, String employee_id) {
        Employee emp = employeeRepository.getOne(employee_id);
        leaves.setEmployee(emp);
        leaveRepository.save(leaves);
    }

    public List<Leaves> getAllLeaves(String employee_id) {
        List<Leaves> leaves = new ArrayList<>();
        leaveRepository.findAllLeavesByEmployeeId(employee_id).forEach(leaves::add);
        return leaves;
    }
}
