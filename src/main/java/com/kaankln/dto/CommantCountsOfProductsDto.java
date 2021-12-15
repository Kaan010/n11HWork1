package com.kaankln.dto;

import java.math.BigDecimal;

//DTO for question 3
public class CommantCountsOfProductsDto {

    private Long productId;
    private String productName;
    private BigDecimal price;
    private Long commantCount;

    @Override
    public String toString() {
        return "CommantCountsOfProductsDto{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", commantCount=" + commantCount +
                '}';
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
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

    public Long getCommantCount() {
        return commantCount;
    }

    public void setCommantCount(Long commantCount) {
        this.commantCount = commantCount;
    }

    public CommantCountsOfProductsDto(Long productId, String productName, BigDecimal price, Long commantCount) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.commantCount = commantCount;
    }

    public CommantCountsOfProductsDto() {

    }
}
