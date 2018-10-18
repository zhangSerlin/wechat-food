package com.wechat.foods.basic.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Proxy;

import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "product_info")
@Proxy(lazy = false)
public class ProductInfo {

    @Id
    @Column(name = "product_id")
    private Long productId;
    private String productName;
    private BigDecimal productPrice;

    private String productDesc;
    private Long productStore;
    private String productIcon;
    private int  categoryType;
    private Date createTime;
    private Date updateTime;

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

    public Long getProductStore() {
        return productStore;
    }

    public void setProductStore(Long productStore) {
        this.productStore = productStore;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public int getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(int  categoryType) {
        this.categoryType = categoryType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
