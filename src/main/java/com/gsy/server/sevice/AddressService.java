package com.gsy.server.sevice;

import com.gsy.server.model.Address;
import com.gsy.server.util.Result;

import java.util.List;

public interface AddressService {

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
    public List<Address> queryAddressByOpenId(String openId);

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
    public int deleteAddressById(String addressId);
}
