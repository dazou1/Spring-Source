package com.dazou.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.*;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author dazou
 * @Date 2019-06-29 15:01
 */
@Service
public class Person implements InitializingBean ,BeanPostProcessor{

	public Person(){
		System.out.println("实例化一个对象");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用初始化方法...afterPropertiesSet");
	}

	//初始化方法的注解方式,等同与init-method,但是 PostConstruct注解是通过后置处理器实现的，在调用初始化方法之前调用
	@PostConstruct
	public void init(){
		System.out.println("调用初始化方法....PostConstruct");
	}
	//销毁方法的注解方式,等同于destory-method
	@PreDestroy
	public void destory(){
		System.out.println("调用销毁化方法....PreDestroy");
	}


//	@Override
//	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("cityService");
//		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
//	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("++++++++++++++");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("-------------");
		return null;
	}

}
