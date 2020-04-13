package com.gsy.server.sevice;

import com.gsy.server.model.Address;
import com.gsy.server.util.Result;

public interface AddressService {

    /**
     * 添加地址
     * @param address
     * @return
     */
    public int addAddress(Address address);
}
