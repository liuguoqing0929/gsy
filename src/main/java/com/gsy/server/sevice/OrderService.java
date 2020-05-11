package com.gsy.server.sevice;

import com.gsy.server.model.Order;

public interface OrderService {

    /**
     * 添加
     * @param order
     * @return
     */
    public int addOrder(Order order);

    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteOrder(String id);

    /**
     * 更新
     * @param order
     * @return
     */
    public int updateOrderById(Order order);
}
