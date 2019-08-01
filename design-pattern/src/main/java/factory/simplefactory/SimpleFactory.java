package factory.simplefactory;

import factory.Audi;
import factory.BMW;
import factory.Benz;
import factory.Car;

/**
 * @Author dazou
 * @Date 2019-06-26 16:40
 */

/**
 * 简单工厂功能过于强大，什么都能生产，不符合实际，现实中也不怎么使用
 *
 * 简单工厂处理所有逻辑，代码臃肿，紊乱，维护困难，进而演变出了工厂方法模式，将各个产品的处理逻辑分离出来
 * 即解耦合
 */
public class SimpleFactory {

	/**
	 * 工厂模式，隐藏复杂的逻辑过程，只关心结果，只给消费者返回结果，（结果论）
	 * 实现统一管理、专业化管理
	 * @param name
	 * @return
	 */
	public Car getCar(String name) {

		switch (name) {
			case "BMW" : return new BMW();
			case "Audi" : return new Audi();
			case "Benz" : return new Benz();
			default: {
				System.out.println("该工厂不生产此类车！");
				return null;
			}
		}
	}
}
