package com.gsy.server.sevice.impl;

import com.gsy.server.mapper.AddressMapper;
import com.gsy.server.mapper.UserMapper;
import com.gsy.server.sevice.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

}
