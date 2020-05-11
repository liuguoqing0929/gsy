package com.gsy.server.controller;

import com.gsy.server.sevice.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/orderStatus")
public class OrderStatusController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderStatusService orderStatusService;
}
