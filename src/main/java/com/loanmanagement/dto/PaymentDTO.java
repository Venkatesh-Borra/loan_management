package com.loanmanagement.dto;

public class PaymentDTO {
    private String paymentId;
    private double amount;
    private String paymentDate;

    // Constructor
    public PaymentDTO(String paymentId, double amount, String paymentDate) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}