package com.kaankln.dto;

import java.util.Date;

//DTO for question 4
public class CustomerCommantsDto {

    private Long customerId;
    private String customerName;
    private String productName;
    private String commant;
    private Date commantTime;

    @Override
    public String toString() {
        return "CustomerCommantsDto{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", commant='" + commant + '\'' +
                ", commantTime='" + commantTime + '\'' +
                '}';
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCommant() {
        return commant;
    }

    public void setCommant(String commant) {
        this.commant = commant;
    }

    public Date getCommantTime() {
        return commantTime;
    }

    public void setCommantTime(Date commantTime) {
        this.commantTime = commantTime;
    }

    public CustomerCommantsDto() {
    }

    public CustomerCommantsDto(Long customerId, String customerName, String productName, String commant, Date commantTime) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.productName = productName;
        this.commant = commant;
        this.commantTime = commantTime;
    }
}
