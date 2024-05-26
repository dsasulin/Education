package ru.sasulin.postProcessor;

import lombok.SneakyThrows;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import java.lang.reflect.Field;
@Component
public class Naming implements BeanPostProcessor {

    @Override
    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        vasia(bean);
        return bean;
    }

    @SneakyThrows
    private void vasia(Object bean) {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field f : fields) {
            if (!f.getName().equals("name") || f.getType() != String.class) continue;
            f.setAccessible(true);
            if (f.get(bean) == null || f.get(bean) == "") {
                f.set(bean, "vasia");
            }
        }
    }
}
