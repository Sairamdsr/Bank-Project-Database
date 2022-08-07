package com.user.validate.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banks {

    @Id
    @Column(name = "bic")
    private String BIC;
    @Column(name = "bankname")
    private String bankName;

    public Banks() {
        super();
    }
}
