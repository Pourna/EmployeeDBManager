package com.service.main.dto;

import com.service.main.model.Address;

public class AddressDTO {

    private String id;

    private Integer houseNumber;

    private String streetName;

    private String district;

    private String state;

    private String country;

    private Integer pinCode;

    public AddressDTO(Address address) {
        this.houseNumber = address.getHouseNumber();
        this.streetName = address.getStreetName();
        this.district = address.getDistrict();
        this.state = address.getState();
        this.country = address.getCountry();
        this.pinCode = address.getPinCode();
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public Integer getPinCode() {
        return pinCode;
    }
}
