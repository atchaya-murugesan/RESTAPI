package com.example.model;

public class Address {
    String name;
    int doorno;
    String streetName;
    int pincode;
    String area;
    String district;
    String state;
    String country;
    public Address(String name, int doorno, String streetName, int pincode, String area, String district, String state,
            String country) {
        this.name = name;
        this.doorno = doorno;
        this.streetName = streetName;
        this.pincode = pincode;
        this.area = area;
        this.district = district;
        this.state = state;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDoorno() {
        return doorno;
    }
    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
    

    
}
