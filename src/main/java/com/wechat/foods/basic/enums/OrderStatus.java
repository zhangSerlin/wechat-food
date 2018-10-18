package com.wechat.foods.basic.enums;

/**
 * @author:zsn
 * @date:${date}${time}
 */
public enum OrderStatus {
    WAIT(0,"新创订单"),
    OVER(1,"订单完成"),
    BACK(2,"订单取消")
    ;

    private  int code;
    private String message;

    OrderStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
