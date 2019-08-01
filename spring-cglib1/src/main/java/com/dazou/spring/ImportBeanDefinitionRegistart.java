package com.dazou.spring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author dazou
 * @Date 2019-06-12 17:56
 */

/**
 * Spring中有两个东西可以对 BeanFactory 中的内容进行修改；
 * 此处为一个，实现了 ImportBeanDefinitionRegistrar，
 * 就可以自己往 factoryBean 中的 BeanDefinitionMap 中添加自己想要的 BeanDefinition，
 * 是通过 BeanDefinitionRegistry.registerBeanDefinition(beanName,BeanDefinition) 方法添加的
 * 然后 spring 就可以实例化这个 bean，mybatis 的核心就在此处
 * 为了实例化一个SpringFactory
 */
public class ImportBeanDefinitionRegistart implements ImportBeanDefinitionRegistrar {


	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//给你一个包名，com.dazou.dao,然后得到里面所有的类，然后进行一个for循环逐个进行加载到Spring中
		//for
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(DazouFactoryBean.class);
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		registry.registerBeanDefinition("cityDao", genericBeanDefinition);
		genericBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.dazou.dao.CityDao");
		genericBeanDefinition.setAutowireMode(3);
	}
}
