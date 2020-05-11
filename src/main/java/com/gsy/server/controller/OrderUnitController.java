package com.gsy.server.controller;

import com.gsy.server.sevice.OrderUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orderUnit")
public class OrderUnitController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderUnitService orderUnitService;
}
