package com.service.main.dto;

import com.service.main.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDTO {

    private String id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String gender;

    private Long contactNumber;

    private Long emergencyContact;

    private AddressDTO currentAddress;

    private AddressDTO permanentAddress;

    private List<LeavesDTO> leaves;

    private List<SalaryDTO> salaries;

    public EmployeeDTO() {

    }

    public EmployeeDTO(Employee employee) {
        this.id = employee.getId();
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.age = employee.getAge();
        this.gender = employee.getGender();
        this.contactNumber = employee.getContactNumber();
        this.emergencyContact = employee.getEmergencyContact();
        this.contactNumber = employee.getContactNumber();
        this.emergencyContact = employee.getEmergencyContact();
        this.currentAddress = employee.getCurrentAddress()!=null ? new AddressDTO(employee.getCurrentAddress()) : null;
        this.permanentAddress = employee.getPermanentAddress()!=null ? new AddressDTO(employee.getPermanentAddress()) : null;
        this.leaves = employee.getLeaves().stream().map(l -> new LeavesDTO(l)).collect(Collectors.toList());
        this.salaries = employee.getSalaries().stream().map(s -> new SalaryDTO(s)).collect(Collectors.toList());
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

    public Long getContactNumber() {
        return contactNumber;
    }

    public Long getEmergencyContact() {
        return emergencyContact;
    }

    public AddressDTO getCurrentAddress() {
        return currentAddress;
    }

    public AddressDTO getPermanentAddress() {
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

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmergencyContact(Long emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setCurrentAddress(AddressDTO currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setPermanentAddress(AddressDTO permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setLeaves (List<LeavesDTO> leaves) {
        this.leaves = leaves;
    }

    public List<LeavesDTO> getLeaves() {
        return leaves;
    }

    public void setSalaries(List<SalaryDTO> salaries) {
        this.salaries = salaries;
    }

    public List<SalaryDTO> getSalaries() {
        return salaries;
    }
}
