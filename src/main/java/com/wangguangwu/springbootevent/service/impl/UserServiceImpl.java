package com.wangguangwu.springbootevent.service.impl;

import com.wangguangwu.springbootevent.event.UserRegisteredEvent;
import com.wangguangwu.springbootevent.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @author wangguangwu
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private ApplicationEventPublisher eventPublisher;

    @Override
    public void registUser(String username) {
        // 业务逻辑
        log.info("User registered: {}", username);

        // 发布事件
        UserRegisteredEvent userRegisteredEvent = new UserRegisteredEvent(this, username);
        eventPublisher.publishEvent(userRegisteredEvent);
    }
}
