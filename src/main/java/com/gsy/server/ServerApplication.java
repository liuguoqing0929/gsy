package com.gsy.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }


//    @Bean //必须new 一个RestTemplate并放入spring容器当中,否则启动时报错
//    public RestTemplate restTemplate() {
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());
//        return restTemplate;
//    }

}
