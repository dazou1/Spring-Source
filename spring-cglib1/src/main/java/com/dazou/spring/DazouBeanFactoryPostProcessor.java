package com.dazou.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Author dazou
 * @Date 2019-06-12 22:48
 */


/**
 * Spring中有两个东西可以对 beanFactory 中的内容进行修改；
 * 此处为一个，实现 BeanFactoryPostProcessor 接口，就可以拿到整个的 beanFactory
 * 就可以在每一个 Bean 实例化之间对Bean 的 BeanDefinition
 * 进行修改或者设置，以此改变 Bean 的行为
 */
@Component
public class DazouBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		GenericBeanDefinition orderService = (GenericBeanDefinition) beanFactory.getBeanDefinition("orderService");

		orderService.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
	}
}
