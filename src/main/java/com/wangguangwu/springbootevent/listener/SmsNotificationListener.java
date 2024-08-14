package com.wangguangwu.springbootevent.listener;

import com.wangguangwu.springbootevent.event.UserRegisteredEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 实现监听器
 * <p>
 * 使用 @EventListener 接口
 *
 * @author wangguangwu
 */
@Component
@Slf4j
public class SmsNotificationListener {

    @EventListener
    public void handleUserRegisteredEvent(UserRegisteredEvent event) {
        log.info("SmsNotification event received: {}", event.getUsername());
    }
}
