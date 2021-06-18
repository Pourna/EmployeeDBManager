package com.service.main.dto;

import com.service.main.model.Salary;

import java.util.Date;

public class SalaryDTO {

    private String id;

    private Date creditedDate;

    private String month;

    private Integer year;

    private Double basic;

    private Double bonus;

    private Double hra;

    private Double total;

    private EmployeeDTO employee;

    public SalaryDTO() {}

    public SalaryDTO(Salary salary) {
        this.basic = salary.getBasic();
        this.hra = salary.getHra();
        this.bonus = salary.getBonus();
        this.month = salary.getMonth();
        this.year = salary.getYear();
        this.total = salary.getTotal();
    }

    public void setCreditedDate(Date date) {
        this.creditedDate = date;
    }

    public Date getCreditedDate() {
        return creditedDate;
    }

    public void setMonth(String month) {
        this.month=month;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public void setHra(Double hra) {
        this.hra = hra;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }

    public String getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getBonus() {
        return bonus;
    }

    public Double getHra() {
        return hra;
    }

    public Double getTotal() {
        return total;
    }
}
