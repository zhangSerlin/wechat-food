package com.wechat.foods.basic.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class LoggerTest {
    private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void getLoge(){
        String name="zs";
        String psd="av";
        logger.info("name:{},pwd:{}",name,psd);
        logger.error("this is error");
    }
}
