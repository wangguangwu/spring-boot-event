package com.wangguangwu.springbootevent.controller;

import com.wangguangwu.springbootevent.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangguangwu
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Resource
    private UserService userService;

    @PostMapping("/registUser")
    public void registUser(@RequestParam String username) {
        userService.registUser(username);
    }
}
