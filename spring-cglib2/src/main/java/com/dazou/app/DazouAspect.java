package com.dazou.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author dazou
 * @Date 2019-06-13 13:47
 */

@Component
//声明一个切面
@Aspect
public class DazouAspect {

	/**
	 * 声明一个切点
	 */
	@Pointcut("execution(* com.dazou.service..*.*(..))")
	private void anyOldTransfer() {


	}

	/**
	 * 声明一个通知
	 */
	@Before("anyOldTransfer()")
	public void doAccessCheck() {
		System.out.println("aop----");
		// ...
	}
}
