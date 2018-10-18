package com.wechat.foods.basic.repository;

import com.wechat.foods.basic.dataobject.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long>{


    List<Category> getCategoryByCategoryTypeIn(List<Integer> categoryList);
}
