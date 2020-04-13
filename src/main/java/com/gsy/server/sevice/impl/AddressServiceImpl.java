package com.gsy.server.sevice.impl;

import com.gsy.server.mapper.AddressMapper;
import com.gsy.server.mapper.UserMapper;
import com.gsy.server.model.Address;
import com.gsy.server.sevice.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public int addAddress(Address address) {

        address.setId(UUID.randomUUID().toString());
        return addressMapper.addAddress(address);
    }

    @Override
    public List<Address> queryAddressByOpenId(String openId) {

        return addressMapper.queryAddressByOpenId(openId);
    }

    @Override
    public int updateAddressByOpenId(Address address) {

        return addressMapper.updateAddressByOpenId(address);
    }

    @Override
    public int deleteAddressById(String addressId) {

        return addressMapper.deleteAddressById(addressId);
    }
}
