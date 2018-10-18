package com.wechat.foods.basic.repository;

import com.wechat.foods.basic.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author:zsn
 * @date:${date}${time}
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailReposityTest {
    @Autowired
    private OrderDetailReposity orderDetailReposity;
    @Test
    public void findByOrderId() {
        List<OrderDetail> byOrderId = orderDetailReposity.findByOrderId(-7959194918114609837l);
        System.out.println(byOrderId.size());
    }
}