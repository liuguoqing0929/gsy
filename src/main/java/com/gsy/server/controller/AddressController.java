package com.gsy.server.controller;

import com.gsy.server.model.Address;
import com.gsy.server.sevice.AddressService;
import com.gsy.server.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private RestTemplate restTemplate;

    private AddressService addressService;


    @RequestMapping("/add")
    public Result addAddress(@RequestBody Address address){

        addressService.addAddress(address);
        return null;
    }
}
