package com.gsy.server.mapper;

import com.gsy.server.model.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressMapper {
    /**
     * 添加地址
     * @param address
     * @return
     */
    public int addAddress(Address address);
}
