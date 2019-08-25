package com.eros.springbootdemo.controller;

import javax.servlet.http.HttpServletRequest;

import com.eros.springbootdemo.service.AsyncTaskService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
     * 异步任务Service
     */
    private final AsyncTaskService asyncTaskService;

    /**
     * 构造方法注入对象
     * @param asyncTaskService 异步任务Service
     */
    public HomeController(AsyncTaskService asyncTaskService){
        this.asyncTaskService = asyncTaskService;
    }

    /**
     * 主页
     */
    @GetMapping(value = { "/", "/index" })
    public String index(HttpServletRequest request) {
        this.logger.info("访问主页 /index queryString:{}", request.getQueryString());

        return "index";
    }

    /**
     * 开始执行异步任务
     */
    @GetMapping(value = "/startAsyncTask")
    @ResponseBody
    public String startAsyncTask(){
        this.logger.info("开始执行异步任务");

        for (int i = 0; i < 20; i++) {
            this.asyncTaskService.executeAsyncTask(i);
            this.asyncTaskService.executeAsyncTaskPlus(i);
        }
        
        return "异步任务已开始执行";
    }
}