package factory.factoryfunction;

import factory.Benz;
import factory.Car;

/**
 * @Author dazou
 * @Date 2019-06-26 17:11
 */
public class BenzFactory implements Factory {
	@Override
	public Car getCar() {
		return new Benz();
	}
}
