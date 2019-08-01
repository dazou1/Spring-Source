package factory.abstractfactory;

import factory.Audi;
import factory.Car;
import factory.factoryfunction.Factory;

/**
 * @Author dazou
 * @Date 2019-06-26 17:11
 */

/**
 * 每个具体工厂的业务逻辑封装
 */
public class AudiFactory extends AbstractFactory {
	@Override
	public Car getCar() {
		return new Audi();
	}
}
