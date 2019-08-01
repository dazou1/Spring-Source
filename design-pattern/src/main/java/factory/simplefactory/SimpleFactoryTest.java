package factory.simplefactory;

import factory.Car;

/**
 * @Author dazou
 * @Date 2019-06-26 16:44
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {

		Car car = new SimpleFactory().getCar("BMW");
		System.out.println(car.getName());
	}
}
