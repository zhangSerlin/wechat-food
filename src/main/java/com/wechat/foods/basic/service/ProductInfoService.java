package com.wechat.foods.basic.service;

import com.wechat.foods.basic.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author:zsn
 * @date:${date}${time}
 */
public interface ProductInfoService {
    List<ProductInfo> getProductByCategoryType(List<Integer> list);

    Page<ProductInfo> getAllProduct(Pageable pageable);

}
