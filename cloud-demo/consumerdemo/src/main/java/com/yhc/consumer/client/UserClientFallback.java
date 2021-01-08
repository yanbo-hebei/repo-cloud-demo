package com.yhc.consumer.client;

import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {
    @Override
    public String queryById(Long id) {
        return "系统忙，未查到该用户";
    }
}
