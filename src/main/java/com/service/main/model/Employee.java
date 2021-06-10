package com.service.main.model;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="id", unique = true)
    private String id;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age", nullable = false)
    private Integer age;

    @Column(name="gender")
    private String gender;

    @Column(name="contact_number", nullable = false)
    private Integer contactNumber;

    @Column(name="emergency_contact")
    private Integer emergencyContact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="current_address_id")
    private Address currentAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="permanent_address_id")
    private Address permanentAddress;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Leaves> leaves;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Salary> salaries;

    public Employee() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public Integer getEmergencyContact() {
        return emergencyContact;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmergencyContact(Integer emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setLeaves (List<Leaves> leaves) {
        this.leaves = leaves;
    }

    public List<Leaves> getLeaves() {
        return leaves;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }
}
