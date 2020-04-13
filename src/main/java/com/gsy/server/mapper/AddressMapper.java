package com.gsy.server.mapper;

import com.gsy.server.model.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressMapper {
    /**
     * 添加地址
     * @param address
     * @return
     */
    public int addAddress(Address address);

    /**
     * 查询用户的所有地址
     * @param openId
     * @return
     */
    public List<Address> queryAddressByOpenId(@Param("openId") String openId);

    /**
     * 更新地址
     * @param address
     * @return
     */
    public int updateAddressByOpenId(Address address);

    /**
     * 删除地址
     * @param addressId
     * @return
     */
    public int deleteAddressById(@Param("addressId") String addressId);
}
