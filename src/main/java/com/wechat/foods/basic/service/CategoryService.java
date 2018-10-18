package com.wechat.foods.basic.service;

import com.wechat.foods.basic.dataobject.Category;

import java.util.List;

public interface CategoryService {

    void  insertOne(Category category);

    void  deleteOne(Category category);

    Category selectOne(Long id);

    List<Category> getProductByCategoryType(List<Integer> categoryType);
}
