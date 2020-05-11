package com.gsy.server.controller;

import com.gsy.server.sevice.OrderTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orderType")
public class OrderTypeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderTypeService orderTypeService;
}
