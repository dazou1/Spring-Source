package proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author dazou
 * @Date 2019-06-26 15:54
 */
public class Huangniu implements MethodInterceptor {

	public Object getInstance(Class clazz) {

		Enhancer enhancer = new Enhancer();

		//设置父类，这一步就是告诉CGLIB，生成的子类要继承的父类是谁
		enhancer.setSuperclass(clazz);

		//设置回调，即会调用该类的 intercept 方法
		enhancer.setCallback(this);

		//1、生成源代码。2、编译成class文件；3、加载到JVM，并返回被代理对象
		// 字节码重组
		return enhancer.create();

	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

		System.out.println("我是黄牛，我可以帮忙买票，但需要手续费！");
		System.out.println("---------------");

		//调用父类的方法，一定要使用 invokeSuper，使用 invoke 的话就会调用子类的方法，即该类，陷入死循环
		methodProxy.invokeSuper(obj, args);

		System.out.println("---------------");
		System.out.println("付款！");

		return null;

	}
}
