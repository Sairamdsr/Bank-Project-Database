package com.user.validate.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {

    @Id
    @Column(name = "currencycode")
    private String currencyCode;
    @Column(name = "currencyname")
    private String currencyName;
    @Column(name = "conversionrate")
    private float conversionRate;

    public Currency() {
        super();
    }
}

