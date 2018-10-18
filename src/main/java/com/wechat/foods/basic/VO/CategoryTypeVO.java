package com.wechat.foods.basic.VO;/**
 * @author:zsn
 * @date:${date}${time}
 */

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 @classname:CategoryTypeVO
 @AUTHOR:ZSN
 @DATE:2018/10/191:57
 */
public class CategoryTypeVO {
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private int categoryType;

    private List<ProductInfoVO> foods;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
    }

    public List<ProductInfoVO> getFoods() {
        return foods;
    }

    public void setFoods(List<ProductInfoVO> foods) {
        this.foods = foods;
    }
}
