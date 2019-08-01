package factory.factoryfunction;

import factory.BMW;
import factory.Car;

/**
 * @Author dazou
 * @Date 2019-06-26 17:11
 */
public class BMWFactory implements Factory {
	@Override
	public Car getCar() {
		return new BMW();
	}
}
