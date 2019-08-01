package com.dazou.test;

import com.dazou.app.AppConfig;
import com.dazou.service.CityService;
import com.dazou.service.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author dazou
 * @Date 2019-06-11 11:03
 */
public class Test {

	public static void main(String[] args) {
		// init Spring
		// 实例化各种 bean
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		// 得到 bean
//		ac.getBean(CityService.class).query();

		Person person = ac.getBean(Person.class);

//		ApplicationContext bf = new ClassPathXmlApplicationContext("fff");
		ac.close();


	}
}
