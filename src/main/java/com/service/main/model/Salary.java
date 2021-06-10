package com.service.main.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="salary")
public class Salary {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    @Column(name="month")
    private String month;

    @Column(name="year")
    private Integer year;

    @Column(name="basic_pay")
    private Double basic;

    @Column(name="bonus")
    private Double bonus;

    @Column(name="hra")
    private Double hra;

    @Column(name="total")
    private Double total;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="employee_id",nullable = false)
    private Employee employee;

    public Salary() {}

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

    public void setEmployee(Employee employee) {
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
