package com.gsy.server.sevice.impl;

import com.gsy.server.mapper.OrderTypeMapper;
import com.gsy.server.sevice.OrderTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("orderTypeService")
public class OrderTypeServiceImpl implements OrderTypeService {

    @Autowired
    private OrderTypeMapper orderTypeMapper;


}
