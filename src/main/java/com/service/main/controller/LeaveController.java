package com.service.main.controller;

import com.service.main.model.Leaves;
import com.service.main.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @RequestMapping("/employee/{employee_id}/leaves")
    public List<Leaves> getAllLeaves(@PathVariable String employee_id){
        return leaveService.getAllLeaves(employee_id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/employee/{employee_id}/leaves")
    public void addLeave(@RequestBody Leaves leaves, @PathVariable String employee_id) {
        leaveService.addLeaves(leaves,employee_id);
    }
}
