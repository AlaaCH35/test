package com.example.elib.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Paiment extends  AbstractEntity{

    private String name;
    private String contactInfo;
    private String accountNumber;
    private String paymentMethod;
    private Double transactionAmount;
    private String currency;
    private Date transactionDate;





}
