package com.nie.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author Akihi
 * @date 2023/6/14 9:16 PM
 */
public class AfterLog implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() +"执行完毕，返回值为"+returnValue);
    }
}
