package com.eros.springbootdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController
 * 
 * @author Eros
 */
@Controller
public class HomeController {
    /**
     * 日志
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 主页
     */
    @GetMapping(value = { "/", "/index" })
    public String index(HttpServletRequest request) {
        this.logger.info("访问主页 /index queryString:{}", request.getQueryString());

        return "index";
    }
}