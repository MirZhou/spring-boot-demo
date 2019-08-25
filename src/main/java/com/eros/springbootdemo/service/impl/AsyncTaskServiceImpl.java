package com.eros.springbootdemo.service.impl;

import com.eros.springbootdemo.service.AsyncTaskService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * AsyncTaskServiceImpl
 */
@Service
public class AsyncTaskServiceImpl implements AsyncTaskService {
    /**
     * 日志
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Async
    @Override
    public void executeAsyncTask(Integer i) {
        this.logger.info("执行异步任务：{}", i);
    }

    @Async
    @Override
    public void executeAsyncTaskPlus(Integer i) {
        this.logger.info("执行异步任务+1：{}", (i + 1));
    }
}