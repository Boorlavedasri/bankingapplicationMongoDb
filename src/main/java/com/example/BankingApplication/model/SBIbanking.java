package com.example.BankingApplication.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SBIbanking {
    @Id
    public String  id;
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
