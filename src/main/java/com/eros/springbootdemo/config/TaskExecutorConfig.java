package com.eros.springbootdemo.config;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * TaskExecutorConfig
 * 
 * <p>开启异步任务支持</p>
 * 
 * @author Eros
 */
@Configuration
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        // 创建线程池策略
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        // 指定核心线程池大小
        taskExecutor.setCorePoolSize(5);
        // 指定线程池最大容量大小
        taskExecutor.setMaxPoolSize(10);
        // 指定
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();

        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}