package com.service.main.controller;

import com.service.main.model.Leaves;
import com.service.main.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LeaveController {

    @Autowired
    private LeaveService leaveService;

    @GetMapping("/employee/{employee_id}/leaves")
    public ResponseEntity<Object> getAllLeaves(@PathVariable String employee_id){
        return new ResponseEntity<>(leaveService.getAllLeaves(employee_id), HttpStatus.OK);
    }

    @PostMapping("/employee/{employee_id}/leaves")
    public void addLeave(@RequestBody Leaves leaves, @PathVariable String employee_id) {
        leaveService.addLeaves(leaves,employee_id);
    }
}
