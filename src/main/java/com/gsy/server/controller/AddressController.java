package com.gsy.server.controller;

import com.gsy.server.enums.ResultCode;
import com.gsy.server.model.Address;
import com.gsy.server.model.WechatUser;
import com.gsy.server.sevice.AddressService;
import com.gsy.server.util.Result;
import com.gsy.server.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AddressService addressService;

    /**
     * 添加地址
     * @param address
     * @return
     */
    @PostMapping("/add")
    public Result addAddress(@RequestBody Address address){

        int result = addressService.addAddress(address);
        if(result > 0)
            return Result.success("添加地址成功");
        return Result.failure("添加地址失败");
    }


    /**
     * 查询用户的所有地址
     * @param openId
     * @return
     */
    @PostMapping("/queryAddressByOpenId")
    public Result queryAddressByOpenId(String openId){
        List<Address> addressList = addressService.queryAddressByOpenId(openId);
        return Result.success(addressList);
    }

    /**
     * 更新地址
     * @param address
     * @return
     */
    @PostMapping("/updateAddressByOpenId")
    public Result updateAddressByOpenId(@RequestBody Address address){
        if(StringUtil.isNull(address.getOpenId()))
            return Result.failure(ResultCode.PARAM_IS_BLANK);
        int result = addressService.updateAddressByOpenId(address);
        if(result > 0)
            return Result.success("更新地址成功");
        return Result.failure("更新地址失败");
    }

    /**
     * 删除地址
     * @param
     * @return
     */
    @PostMapping("/deleteAddressById")
    public Result deleteAddressById(String addressId){

        int result = addressService.deleteAddressById(addressId);
        if(result > 0)
            return Result.success("删除地址成功");
        return Result.failure("删除地址失败");
    }
}
