package com.user.validate.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {

    @Id
    @Column(name = "customerid")
    private String customerId;
    @Column(name = "accountholdername")
    private String accountHolderName;
    @Column(name = "overdraftflag")
    private int overDraftFlag;
    @Column(name = "clearbalance")
    private float clearBalance;
    @Column(name = "customeraddress")
    private String customerAddress;
    @Column(name = "customercity")
    private String customerCity;
    @Column(name = "customertype")
    private String customerType;

    public Customers() {
        super();
    }
}
