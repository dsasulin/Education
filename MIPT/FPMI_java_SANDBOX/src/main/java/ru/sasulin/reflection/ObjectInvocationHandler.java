package ru.sasulin.reflection;

import lombok.SneakyThrows;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ObjectInvocationHandler<T> implements InvocationHandler {

    private T currentObject;
    private Map<Method, Object> results = new HashMap<>();

    public ObjectInvocationHandler(T currentObject) {
        this.currentObject = currentObject;
    }

    @Override
    @SneakyThrows
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object objectResult;
        Method currenMethod;
        currenMethod = currentObject.getClass()
                .getMethod(method.getName(), method.getParameterTypes());
        if (currenMethod.isAnnotationPresent(Cache.class)) {
            if (results.containsKey(currenMethod)) {
                return results.get(currenMethod);
            }
            objectResult = method.invoke(currentObject, args);
            results.put(currenMethod, objectResult);
            return objectResult;
        }
        if (currenMethod.isAnnotationPresent(Mutator.class)){
            results.clear();
        }
        return method.invoke(currentObject, args);
    }
}
