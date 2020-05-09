package com.gsy.server.mapper;

import com.gsy.server.model.OrderStatus;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderStatusMapper {

    /**
     * 添加
     * @param orderStatus
     * @return
     */
    public int addOrderStatus(OrderStatus orderStatus);

    /**
     * 查询
     * @return
     */
    public List<OrderStatus> queryOrderStatus();

    /**
     * 更新地址
     * @param orderStatus
     * @return
     */
    public int updateOrderStatusById(OrderStatus orderStatus);

    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteOrderStatusById(@Param("id") String id);

}
