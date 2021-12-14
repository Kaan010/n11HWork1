package com.kaankln.dto;

//DTO for question 4
public class CustomerCommantsDto {

    private String customerId;
    private String customerName;
    private String productName;
    private String commant;
    private String commantTime;

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
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

    public String getCommantTime() {
        return commantTime;
    }

    public void setCommantTime(String commantTime) {
        this.commantTime = commantTime;
    }

    public CustomerCommantsDto() {
    }

    public CustomerCommantsDto(String customerId, String customerName, String productName, String commant, String commantTime) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.productName = productName;
        this.commant = commant;
        this.commantTime = commantTime;
    }
}
