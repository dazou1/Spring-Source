package factory.factoryfunction;

import factory.Audi;
import factory.Car;

/**
 * @Author dazou
 * @Date 2019-06-26 17:11
 */
public class AudiFactory implements Factory {
	@Override
	public Car getCar() {
		return new Audi();
	}
}
