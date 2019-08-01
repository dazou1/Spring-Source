package factory.abstractfactory;

import factory.Audi;
import factory.BMW;
import factory.Benz;
import factory.Car;

/**
 * @Author dazou
 * @Date 2019-06-26 17:24
 */

/**
 * 抽象工厂自带逻辑处理，抽象工厂结合了简单工厂和工厂方法模式的优点，
 * 既拥有简单工厂的处理逻辑实现，又有工厂方法的每个具体工厂的处理逻辑分离，解耦合
 */
public abstract class AbstractFactory {

	protected abstract Car getCar();

	/**
	 * //动态配置功能
	 * 固定的委派模式
	 * @param name
	 * @return
	 */
	public Car getCar(String name) {

		switch (name) {
			case "BMW" : return new BMWFactory().getCar();
			case "Audi" : return new AudiFactory().getCar();
			case "Benz" : return new BenzFactory().getCar();
			default: {
				System.out.println("该工厂不生产此类车！");
				return null;
			}
		}
	}

}
