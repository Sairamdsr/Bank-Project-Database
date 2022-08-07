package com.user.validate.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private long employeeId;
    private String employeeName;
    private String employeePassword;

    public Employee() {
        super();
    }
}
