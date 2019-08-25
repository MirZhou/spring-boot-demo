package com.eros.springbootdemo.service;

/**
 * AsyncTaskService
 * 
 * @author Eros
 */
public interface AsyncTaskService {
    /**
     * 执行异步任务打印参数
     * @param i 参数
     */
    void executeAsyncTask(Integer i);
    
    /**
     * 执行异步任务打印参数+1
     * @param i 参数
     */
    void executeAsyncTaskPlus(Integer i);
}