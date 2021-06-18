package com.service.main.dto;

import com.service.main.model.Leaves;

import java.util.Date;

public class LeavesDTO {

    private String id;

    private Double noOfDays;

    private Date fromDate;

    private Date toDate;

    private String status;

    private EmployeeDTO employee;

    public LeavesDTO() {}

    public LeavesDTO(Leaves leaves) {
        this.noOfDays = leaves.getNoOfDays();
        this.fromDate = leaves.getFromDate();
        this.toDate = leaves.getToDate();
        this.status = leaves.getStatus();
    }

    public void setNoOfDays(Double noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }

    public Double getNoOfDays() {
        return noOfDays;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public String getStatus() {
        return status;
    }
}
