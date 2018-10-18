package com.wechat.foods.basic.repository;

import com.wechat.foods.basic.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * @author:zsn
 * @date:${date}${time}
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterReposityTest {
    @Autowired
    private OrderMasterReposity orderMasterReposity;


    public void findByBuyerOpenid() {
        OrderMaster orderMaster=new OrderMaster();
        orderMaster.setOrderId(UUID.randomUUID().getLeastSignificantBits());
        orderMaster.setBuyerAddress("sdsd");
        orderMaster.setBuyerName("zs");
        orderMaster.setBuyerOpenid("1101010");
        orderMaster.setBuyerPhone(1232334);
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());
        orderMaster.setOrderAmount(new BigDecimal(200));
        orderMasterReposity.save(orderMaster);
    }
    @Test
    public  void getMaster(){
        PageRequest pageRequest=new PageRequest(0,5);
        List<OrderMaster> byBuyerOpenid = orderMasterReposity.findByBuyerOpenid("1101010", pageRequest);
        System.out.println(byBuyerOpenid.size());
    }
}