package com.example.buurttuin.Dtos;

import com.example.buurttuin.Fields.Borrower;
import com.example.buurttuin.Fields.GardenMember;
import com.example.buurttuin.Fields.Lender;

import java.util.HashSet;
import java.util.Set;

public class UserDto {

    private Long id;

    private String userName;
    private String password;
    //    private UserImg
    private String firstName;
    private String lastName;
    private String zipcode;
    private String streetName;
    private Long houseNumber;
    private String email;

    private Lender lender;
    private Set<Borrower> borrowers = new HashSet<>();
    private GardenMember gardenMember;

    public GardenMember getGardenMember() {
        return gardenMember;
    }

    public void setGardenMember(GardenMember gardenMember) {
        this.gardenMember = gardenMember;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Long getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Long houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Lender getLender() {
        return lender;
    }

    public void setLender(Lender lender) {
        this.lender = lender;
    }

    public Set<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(Set<Borrower> borrowers) {
        this.borrowers = borrowers;
    }

    public void setBorrower(Set<Borrower> borrowers) {
        this.borrowers = borrowers;
    }
}
