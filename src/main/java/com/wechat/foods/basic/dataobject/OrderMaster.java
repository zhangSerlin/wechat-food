package com.wechat.foods.basic.dataobject;/**
 * @author:zsn
 * @date:${date}${time}
 */

import com.wechat.foods.basic.enums.OrderStatus;
import com.wechat.foods.basic.enums.PayStatus;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

/**
 @classname:OrderMaster
 @AUTHOR:ZSN
 @DATE:2018/10/193:07
 */
@Entity
@Table(name = "order_master")
public class OrderMaster {
    @Id
    @Column(name = "order_id")
    private long orderId;
    private String buyerName;
    private String buyerOpenid;
    private long buyerPhone;
    private String buyerAddress;
    private BigDecimal orderAmount;
    private int orderStatus= OrderStatus.WAIT.getCode();
    private int payStatus= PayStatus.WAIT.getCode();
    private Date createTime;
    private Date updateTime;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerOpenid() {
        return buyerOpenid;
    }

    public void setBuyerOpenid(String buyerOpenid) {
        this.buyerOpenid = buyerOpenid;
    }

    public long getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(long buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
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
