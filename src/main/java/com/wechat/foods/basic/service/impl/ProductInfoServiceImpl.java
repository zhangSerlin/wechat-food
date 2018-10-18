package com.wechat.foods.basic.service.impl;/**
 * @author:zsn
 * @date:${date}${time}
 */

import com.wechat.foods.basic.dataobject.ProductInfo;
import com.wechat.foods.basic.repository.ProductInfoRepository;
import com.wechat.foods.basic.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 @classname:ProductInfoServiceImpl
 @AUTHOR:ZSN
 @DATE:2018/10/191:26
 */
@Service
@Transactional
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoRepository productInfoRepository;
    @Override
    public List<ProductInfo> getProductByCategoryType(List<Integer> list) {
        return productInfoRepository.findByCategoryTypeIn(list);
    }

    @Override
    public Page<ProductInfo> getAllProduct(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }
}
