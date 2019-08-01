package com.dazou.spring;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @Author dazou
 * @Date 2019-06-12 18:53
 */

/**
 * 此类用于通过反射构建一个类的对象出来
 */
public class DazouFactoryBean implements FactoryBean {

	Class mapperInterface;

	/**
	 * 用于注解形式的传参数
	 * @param mapperInterface
	 */
	public DazouFactoryBean(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
		System.out.println("init 1");
	}

	/**
	 * 用于XML形式的传参数
	 */
	public DazouFactoryBean() {
		System.out.println("init 0");
	}

	@Override
	public Object getObject() throws Exception {

		//模拟mybatis
		Class[] clazzs = new Class[]{mapperInterface};
		Object object = Proxy.newProxyInstance(DazouFactoryBean.class.getClassLoader(), clazzs, new DazouInvocationHandler());

		return object;
	}

	@Override
	public Class<?> getObjectType() {

		return mapperInterface;
	}
}
