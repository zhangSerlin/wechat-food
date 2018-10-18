package com.wechat.foods.basic.VO;/**
 * @author:zsn
 * @date:${date}${time}
 */

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 @classname:Result
 @AUTHOR:ZSN
 @DATE:2018/10/191:56
 */
public class Result {
    private int code;
    private String msg;
    @JsonProperty("data")
    private List<CategoryTypeVO> categoryTypeVOS;

    public List<CategoryTypeVO> getCategoryTypeVOS() {
        return categoryTypeVOS;
    }

    public void setCategoryTypeVOS(List<CategoryTypeVO> categoryTypeVOS) {
        this.categoryTypeVOS = categoryTypeVOS;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
