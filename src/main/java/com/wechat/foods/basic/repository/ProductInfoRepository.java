package com.wechat.foods.basic.repository;

import com.wechat.foods.basic.dataobject.ProductInfo;
import com.wechat.foods.basic.enums.CategoryType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductInfoRepository  extends JpaRepository<ProductInfo,Long>{



    List<ProductInfo> findByCategoryTypeIn(List<Integer> list);
}
