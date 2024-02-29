package com.example.BankingApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SBIbankrequest {
    public String accountNumber;
    public String accountHolderName;
    public String accountType;
    public double balance;
    public Date accountcreationdate;
    public String accountStatus;
    public String branch;
    public String ifsc;
    public String pannumber;
    public String email;
    public String phonenumber;
    public String address;
    public String state;
    public String city;
    public String country;
    public String pincode;
}
