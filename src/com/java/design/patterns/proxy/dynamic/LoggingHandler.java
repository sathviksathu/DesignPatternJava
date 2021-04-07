package com.java.design.patterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

public class LoggingHandler implements InvocationHandler {
    private final Object target;
    private HashMap<String, Integer> calls = new HashMap<>();

    public LoggingHandler(Object person) {
        this.target = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        calls.merge(methodName,1,Integer::sum);
        if(methodName.contains("toString")){
            return calls.toString();
        }
        return method.invoke(target,args);
    }
}
