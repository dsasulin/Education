package ru.sasulin.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomBeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;
        BeanDefinition randomFactory = new GenericBeanDefinition();
        randomFactory.setScope("singleton");
        randomFactory.setBeanClassName("ru.sasulin.postProcessors.RandomConfig");
        registry.registerBeanDefinition("randomConfig", randomFactory);

        BeanDefinition randomInt = new GenericBeanDefinition();
        randomInt.setScope("prototype");
        randomInt.setBeanClassName("java.lang.Integer");
        randomInt.setFactoryBeanName("randomConfig");
        randomInt.setFactoryMethodName("nextInt");
        registry.registerBeanDefinition("random", randomInt);
    }
}

