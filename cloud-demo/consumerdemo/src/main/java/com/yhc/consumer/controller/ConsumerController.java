package com.yhc.consumer.controller;

import com.yhc.consumer.client.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/{id}")
    public String queryById(@PathVariable("id") Long id){
        String user = userClient.queryById(id);
        log.debug(user);
        return user;
    }

    public String queryByIdFallback(Long id){
        return "服务忙，请稍后访问！！";
    }

    public String queryByIdFallback(){
        return "服务忙，请稍后访问！！";
    }


}
