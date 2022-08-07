package com.user.validate.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Logger {

    @Id
    private long loggerId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customerId;
    private int userId;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employeeId;
    private String screenName;
    private String action;
    private String ipAddress;

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public Logger() {
        super();
    }
}

