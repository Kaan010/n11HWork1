package com.kaankln.dto;

import java.math.BigDecimal;

//DTO for question 2
public class ProductCommantAllInfoDto {

    private String productName;
    private String categoriName;
    private BigDecimal productPrice;
    private String userName;
    private String userLastName;
    private String userEmail;
    private String userTelephone;
    private String commant;
    private BigDecimal commantTime;

    public ProductCommantAllInfoDto(String productName,
                                    String categoriName,
                                    BigDecimal productPrice,
                                    String userName,
                                    String userLastName,
                                    String userEmail,
                                    String userTelephone,
                                    String commant,
                                    BigDecimal commantTime) {
        this.productName = productName;
        this.categoriName = categoriName;
        this.productPrice = productPrice;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userTelephone = userTelephone;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
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
                ", userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userTelephone='" + userTelephone + '\'' +
                ", commant='" + commant + '\'' +
                ", commantTime=" + commantTime +
                '}';
    }
}
