package factory.abstractfactory;

import factory.BMW;
import factory.Car;
import factory.factoryfunction.Factory;

/**
 * @Author dazou
 * @Date 2019-06-26 17:11
 */
public class BMWFactory extends AbstractFactory {
	@Override
	public Car getCar() {
		return new BMW();
	}
}
