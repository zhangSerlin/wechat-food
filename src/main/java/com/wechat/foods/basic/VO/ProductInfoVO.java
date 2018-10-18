package com.wechat.foods.basic.VO;/**
 * @author:zsn
 * @date:${date}${time}
 */

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 @classname:ProductInfoVO
 @AUTHOR:ZSN
 @DATE:2018/10/191:57
 */
public class ProductInfoVO {
    @JsonProperty("id")
    private long productId;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private BigDecimal productPrice;
    @JsonProperty("description")
    private String productDesc;
    @JsonProperty("icon")
    private String productIcon;
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }
}
