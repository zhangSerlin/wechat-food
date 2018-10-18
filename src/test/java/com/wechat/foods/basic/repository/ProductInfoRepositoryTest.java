package com.wechat.foods.basic.repository;

import com.wechat.foods.basic.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void test(){
        ProductInfo one = productInfoRepository.getOne(85488765l);
        System.out.println(one.getProductName());
    }
}