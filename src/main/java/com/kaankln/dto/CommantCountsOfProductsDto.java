package com.kaankln.dto;

import java.math.BigDecimal;

//DTO for question 3
public class CommantCountsOfProductsDto {

    private String productId;
    private String productName;
    private BigDecimal price;
    private BigDecimal commantCount;

    @Override
    public String toString() {
        return "CommantCountsOfProductsDto{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", commantCount=" + commantCount +
                '}';
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCommantCount() {
        return commantCount;
    }

    public void setCommantCount(BigDecimal commantCount) {
        this.commantCount = commantCount;
    }

    public CommantCountsOfProductsDto(String productId, String productName, BigDecimal price, BigDecimal commantCount) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.commantCount = commantCount;
    }

    public CommantCountsOfProductsDto(String productId) {
        this.productId = productId;
    }
}
