package com.gsy.server.sevice;

import com.gsy.server.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-12
 * @time 1:01
 */
@Service
public class MyService {
    // private final MyMapper myMapper;

//    @Autowired
//    public MyService(MyMapper myMapper) {
//        this.myMapper = myMapper;
//    }

    @Autowired
    private MyMapper myMapper;

    public String test() {

        return myMapper.test();
//        return "二傻子是胥晓雯";
    }
}
