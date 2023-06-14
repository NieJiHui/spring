package com.nie.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Akihi
 * @date 2023/6/14 8:30 PM
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public Object getTarget() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    public void setTarget(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target,args);
        return result;
    }

    public void log(String msg){
        System.out.println("执行了" + msg +"方法");
    }
}
