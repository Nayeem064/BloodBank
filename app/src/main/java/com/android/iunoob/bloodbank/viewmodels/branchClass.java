package com.android.iunoob.bloodbank.viewmodels;

public class branchClass {
    private String Address, Division, Contact;

    public String getAddress() {
        return Address;
    }

    public String getDivision() {
        return Division;
    }

    public String getContact() {
        return Contact;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setDivision(String division) {
        Division = division;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public branchClass(String address, String division, String contact) {
        Address = address;
        Division = division;
        Contact = contact;
    }
}
