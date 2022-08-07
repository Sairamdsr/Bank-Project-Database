package com.user.validate.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MessageCode {

    @Id
    @Column(name = "messagecode")
    private String messageCode;
    private String instruction;

    public MessageCode() {
        super();
    }
}
