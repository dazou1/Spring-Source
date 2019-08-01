package com.dazou.spring;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author dazou
 * @Date 2019-06-12 18:42
 */
public class DazouInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("query db：" + method.getAnnotation(Select.class).value()[0]);
		return null;
	}
}
