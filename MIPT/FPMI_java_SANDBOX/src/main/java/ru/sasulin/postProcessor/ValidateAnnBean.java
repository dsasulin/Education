package ru.sasulin.postProcessor;

import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.sasulin.reflection.Validate;
import ru.sasulin.reflection.Validator;

@Component
public class ValidateAnnBean implements BeanPostProcessor {
    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws org.springframework.beans.BeansException {
        if (bean.getClass().isAnnotationPresent(Validate.class)) {
            Validator.validate(bean);
        }
        return bean;
    }
}
