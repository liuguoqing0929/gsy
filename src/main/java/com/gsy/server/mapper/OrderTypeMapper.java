package com.gsy.server.mapper;

import com.gsy.server.model.OrderType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderTypeMapper {

    /**
     * 添加
     * @param orderType
     * @return
     */
    public int addOrderType(OrderType orderType);

    /**
     * 查询
     * @return
     */
    public List<OrderType> queryOrderType();

    /**
     * 更新地址
     * @param orderType
     * @return
     */
    public int updateOrderTypeById(OrderType orderType);

    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteOrderTypeById(@Param("id") String id);

}
