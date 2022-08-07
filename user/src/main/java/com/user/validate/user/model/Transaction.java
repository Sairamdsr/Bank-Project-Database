package com.user.validate.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Transaction {

    @Id
    private int transactionId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customerId;
    @ManyToOne
    @JoinColumn(name = "currency_code")
    private Currency currencyCode;
    @ManyToOne
    @JoinColumn(name = "sender_bic")
    private Banks senderBIC;
    @ManyToOne
    @JoinColumn(name = "receiver_bic_bic")
    private Banks receiverBIC;
    private String receiverAccountHolderNumber;
    private String receiverAccountHolderName;
    @ManyToOne
    @JoinColumn(name = "transfer_type_code")
    private TransferType transferTypeCode;
    @ManyToOne
    @JoinColumn(name = "message_code")
    private MessageCode messageCode;
    private float currencyAmount;
    private float transferFees;
    private float inrAmount;
    private Date transferDate;

    public MessageCode getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(MessageCode messageCode) {
        this.messageCode = messageCode;
    }

    public TransferType getTransferTypeCode() {
        return transferTypeCode;
    }

    public void setTransferTypeCode(TransferType transferTypeCode) {
        this.transferTypeCode = transferTypeCode;
    }

    public Banks getReceiverBIC() {
        return receiverBIC;
    }

    public void setReceiverBIC(Banks receiverBIC) {
        this.receiverBIC = receiverBIC;
    }

    public Banks getSenderBIC() {
        return senderBIC;
    }

    public void setSenderBIC(Banks senderBIC) {
        this.senderBIC = senderBIC;
    }

    public Currency getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(Currency currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public Transaction() {
        super();
    }
}

