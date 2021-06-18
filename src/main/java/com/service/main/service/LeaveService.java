package com.service.main.service;

import com.service.main.dao.EmployeeRepository;
import com.service.main.dao.LeaveRepository;
import com.service.main.model.Employee;
import com.service.main.model.Leaves;
import com.service.main.dto.LeavesDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<LeavesDTO> getAllLeaves(String employee_id) {
        List<Leaves> leaves = leaveRepository.findAllLeavesByEmployeeId(employee_id);
        ModelMapper modelMapper = new ModelMapper();
        List<LeavesDTO> leavesEntities = leaves
                .stream()
                .map(user -> modelMapper.map(leaves, LeavesDTO.class))
                .collect(Collectors.toList());
        return leavesEntities;
    }
}
