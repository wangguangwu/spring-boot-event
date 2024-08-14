package com.wangguangwu.springbootevent.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 用户注册事件
 *
 * @author wangguangwu
 */
@Getter
public class UserRegisteredEvent extends ApplicationEvent {

    private final String username;

    public UserRegisteredEvent(Object source, String username) {
        super(source);
        this.username = username;
    }
}
