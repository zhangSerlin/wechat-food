package com.wechat.foods.basic.repository;

import com.wechat.foods.basic.dataobject.OrderMaster;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author:zsn
 * @date:${date}${time}
 */
public interface OrderMasterReposity extends JpaRepository<OrderMaster,Long> {

    List<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable page);

}
