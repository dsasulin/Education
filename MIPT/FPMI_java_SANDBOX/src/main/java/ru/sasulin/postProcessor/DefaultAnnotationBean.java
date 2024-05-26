package ru.sasulin.postProcessor;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import ru.sasulin.reflection.Default;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Component
public class DefaultAnnotationBean implements BeanPostProcessor {
    @Autowired
    ApplicationContext ctx;
    Map<String, Object> beans = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(Default.class)) {
            beans.put(beanName, bean);
        } else {
            for (Field f : bean.getClass().getDeclaredFields()) {
                if (f.isAnnotationPresent(Default.class)) {
                    beans.put(beanName, bean);
                    break;
                }
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beans.containsKey(beanName)) {
            defaults(beans.get(beanName));
        }
        beans.remove(beanName);
        return bean;
    }

    @SneakyThrows
    private void defaults(Object bean) {
        if (bean.getClass().isAnnotationPresent(Default.class)) {
            String defBeanName = String.valueOf(bean.getClass().getAnnotation(Default.class).value());
            Object defBean = ctx.getBean(defBeanName);
            Method m = defBean.getClass().getDeclaredMethod("getDefault", Class.class);
            for (Field f : bean.getClass().getDeclaredFields()) {
                if (f.get(bean) == null) {
                    f.set(bean, m.invoke(defBean, f.getType()));
                }
            }
        } else {
            for (Field f : bean.getClass().getDeclaredFields()) {
                if (!f.isAnnotationPresent(Default.class)) continue;
                f.setAccessible(true);
                if (f.get(bean) != null) continue;
                String defBeanName = String.valueOf(f.getAnnotation(Default.class).value());
                Object defBean = ctx.getBean(defBeanName);
                f.set(bean, defBean);
            }
        }
    }

}
