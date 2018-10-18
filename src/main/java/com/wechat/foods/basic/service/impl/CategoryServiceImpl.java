package com.wechat.foods.basic.service.impl;

import com.wechat.foods.basic.dataobject.Category;
import com.wechat.foods.basic.repository.CategoryRepository;
import com.wechat.foods.basic.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void insertOne(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteOne(Category category) {
        categoryRepository.delete(category);
    }

    @Override
    public Category selectOne(Long id) {
        return categoryRepository.getOne(id);
    }

    @Override
    public List<Category> getProductByCategoryType(List<Integer> categoryType) {

        return categoryRepository.getCategoryByCategoryTypeIn(categoryType);
    }
}
