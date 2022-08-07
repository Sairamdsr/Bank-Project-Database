package com.user.validate.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransferType {

    @Id
    @Column(name = "transfercode")
    private String transferTypeCode;
    @Column(name = "transferdescription")
    private String transferTypeDescription;

    public TransferType() {
        super();
    }
}

