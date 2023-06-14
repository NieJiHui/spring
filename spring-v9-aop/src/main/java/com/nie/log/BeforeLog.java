package com.nie.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Akihi
 * @date 2023/6/14 9:10 PM
 */
public class BeforeLog implements MethodBeforeAdvice {
    /**
     *
     * @param method method being invoked 要执行的目标对象的方法
     * @param args arguments to the method 目标方法的参数
     * @param target target of the method invocation. May be {@code null}. 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的" + method.getName()+"被执行了");
    }
}
