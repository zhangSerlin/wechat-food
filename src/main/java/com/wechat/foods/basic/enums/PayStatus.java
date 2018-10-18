package com.wechat.foods.basic.enums;

/**
 * @author:zsn
 * @date:${date}${time}
 */
public enum PayStatus {
        WAIT(0,"未支付"),
        FINISH(1,"已支付"),
        BACK(2,"取消")
    ;

    private int code;
    private String msg;

    PayStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
}
