package com.wechat.foods.basic.enums;

/**
 * @author:zsn
 * @date:${date}${time}
 */
public enum CategoryType {
    Up(0,"热销产品"),
    down(1,"滞销产品");
    private int code;
    private String msg;

    CategoryType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
