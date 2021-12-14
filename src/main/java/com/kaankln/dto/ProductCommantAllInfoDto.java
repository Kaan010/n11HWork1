package com.kaankln.dto;

import java.math.BigDecimal;

//DTO for question 2
public class ProductCommantAllInfoDto {

    private String productName;
    private String categoriName;
    private BigDecimal productPrice;
    private String customerName;
    private String customerLastName;
    private String customerEmail;
    private String customerTelephone;
    private String commant;
    private BigDecimal commantTime;

    public ProductCommantAllInfoDto(String productName,
                                    String categoriName,
                                    BigDecimal productPrice,
                                    String customerName,
                                    String customerLastName,
                                    String customerEmail,
                                    String customerTelephone,
                                    String commant,
                                    BigDecimal commantTime) {
        this.productName = productName;
        this.categoriName = categoriName;
        this.productPrice = productPrice;
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.customerEmail = customerEmail;
        this.customerTelephone = customerTelephone;
        this.commant = commant;
        this.commantTime = commantTime;
    }

    public ProductCommantAllInfoDto() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategoriName() {
        return categoriName;
    }

    public void setCategoriName(String categoriName) {
        this.categoriName = categoriName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerTelephone() {
        return customerTelephone;
    }

    public void setCustomerTelephone(String customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    public String getCommant() {
        return commant;
    }

    public void setCommant(String commant) {
        this.commant = commant;
    }

    public BigDecimal getCommantTime() {
        return commantTime;
    }

    public void setCommantTime(BigDecimal commantTime) {
        this.commantTime = commantTime;
    }

    @Override
    public String toString() {
        return "ProductCommantAllInfoDto{" +
                "productName='" + productName + '\'' +
                ", categoriName='" + categoriName + '\'' +
                ", productPrice=" + productPrice +
                ", customerName='" + customerName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerTelephone='" + customerTelephone + '\'' +
                ", commant='" + commant + '\'' +
                ", commantTime=" + commantTime +
                '}';
    }
}
