package com.wangguangwu.springbootevent.listener;

import com.wangguangwu.springbootevent.event.UserRegisteredEvent;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 实现监听器
 * <p>
 * 实现 ApplicationListener 接口
 *
 * @author wangguangwu
 */
@Component
@Slf4j
public class EmailListener implements ApplicationListener<UserRegisteredEvent> {

    @Override
    public void onApplicationEvent(@NonNull UserRegisteredEvent event) {
        log.info("Email event received: {}", event.getUsername());
    }
}
