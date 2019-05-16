package com.superbeyone.design.pattern.creational.singleton;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className ThreadLocalInstance
 * @description
 * @date 2019-05-16 15:45
 **/

public class ThreadLocalInstance {

    private ThreadLocalInstance() {
    }

    private static final ThreadLocal<ThreadLocalInstance> threadLocal = new ThreadLocal<ThreadLocalInstance>() {

        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    public ThreadLocalInstance getInstance() {
        return threadLocal.get();
    }

}
