package com.gsy.server.mapper;

import com.gsy.server.model.OrderUnit;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderUnitMapper {

    /**
     * 添加
     * @param orderUnit
     * @return
     */
    public int addOrderUnit(OrderUnit orderUnit);

    /**
     * 查询
     * @return
     */
    public List<OrderUnit> queryOrderUnit();

    /**
     * 更新地址
     * @param orderUnit
     * @return
     */
    public int updateOrderUnitById(OrderUnit orderUnit);

    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteOrderUnitById(@Param("id") String id);

}
