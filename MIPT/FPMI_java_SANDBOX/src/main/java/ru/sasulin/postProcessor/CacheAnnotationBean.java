package ru.sasulin.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ru.sasulin.reflection.Cache;
import ru.sasulin.reflection.ReflectionUtils;

@Component
public class CacheAnnotationBean implements BeanPostProcessor {
    Map<String, Object> beans = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (Arrays.stream(bean.getClass().getDeclaredMethods()).anyMatch(m -> m.isAnnotationPresent(Cache.class)))
            beans.put(beanName,bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beans.containsKey(beanName)) {
            beans.remove(beanName);
            return ReflectionUtils.cache(bean);
        }
        return bean;
    }
}
