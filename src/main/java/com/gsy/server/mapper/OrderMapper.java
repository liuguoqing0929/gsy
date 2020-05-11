package com.gsy.server.mapper;

import com.gsy.server.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    public int addOrder(Order order);

    public int deleteOrder(@Param("id") String id);

    public int updateOrderById(Order order);
}
