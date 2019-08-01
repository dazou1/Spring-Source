package factory.abstractfactory;

import factory.Car;

/**
 * @Author dazou
 * @Date 2019-06-26 17:30
 */
public class DefaultFactory extends AbstractFactory {
	private AbstractFactory defaultFactory = new AudiFactory();

	@Override
	protected Car getCar() {
		return defaultFactory.getCar();
	}
}
