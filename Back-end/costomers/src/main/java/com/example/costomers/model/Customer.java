package com.example.costomers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int custId;
    private String custName;
    private String Address;
    private int Phone_No;
    private  String PackageType;

    private int Amount;


    private String description;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhone_No(){
        return Phone_No;
    }
    public void setPhone_No(int phone_No) {
        Phone_No = phone_No;
    }

    public String getPackageType() {
        return PackageType;
    }
    public void setPackageType(String packageType) {
        PackageType = packageType;
    }
    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
