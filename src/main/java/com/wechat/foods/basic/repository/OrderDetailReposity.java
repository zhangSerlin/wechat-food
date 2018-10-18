package com.wechat.foods.basic.repository;

import com.wechat.foods.basic.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author:zsn
 * @date:${date}${time}
 */
public interface OrderDetailReposity extends JpaRepository<OrderDetail,Long> {

    List<OrderDetail> findByOrderId(long orderId);
}
