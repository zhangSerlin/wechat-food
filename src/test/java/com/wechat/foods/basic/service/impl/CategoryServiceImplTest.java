package com.wechat.foods.basic.service.impl;

import com.wechat.foods.basic.dataobject.Category;
import com.wechat.foods.basic.repository.CategoryRepository;
import com.wechat.foods.basic.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private CategoryRepository categoryRepository;

    public void insertOne() {
        Category category=new Category();
        category.setCategoryId(UUID.randomUUID().getLeastSignificantBits());
        category.setCategoryName("美食");
        category.setCategoryType(0);
        category.setCreateTime(new Date());
        category.setUpdateTime(new Date());
        categoryService.insertOne(category);
    }

    @Test
    public void test2(){
        List<Category> lists=categoryService.getProductByCategoryType(Arrays.asList(0,1));
        System.out.println(lists.size());
    }
}