package com.gsy.server.controller;

import com.gsy.server.enums.ResultCode;
import com.gsy.server.model.WechatUser;
import com.gsy.server.sevice.AddressService;
import com.gsy.server.sevice.UserService;
import com.gsy.server.util.Result;
import com.gsy.server.util.StringUtil;
import com.gsy.server.util.WechatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private RestTemplate restTemplate;

    private AddressService addressService;
}
