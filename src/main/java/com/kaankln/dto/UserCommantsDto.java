package com.kaankln.dto;

import java.math.BigDecimal;

//DTO for question 4
public class UserCommantsDto {

    private String userId;
    private String userName;
    private String productName;
    private String commant;
    private String commantTime;

    @Override
    public String toString() {
        return "UserCommantsDto{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                ", commant='" + commant + '\'' +
                ", commantTime='" + commantTime + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public UserCommantsDto(String userId) {
        this.userId = userId;
    }

    public UserCommantsDto(String userId, String userName, String productName, String commant, String commantTime) {
        this.userId = userId;
        this.userName = userName;
        this.productName = productName;
        this.commant = commant;
        this.commantTime = commantTime;
    }
}
