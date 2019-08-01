package factory.factoryfunction;

import factory.Car;

/**
 * @Author dazou
 * @Date 2019-06-26 17:07
 */

/**
 * 工厂接口，定义了所有工厂的执行标准
 */
public interface Factory {

	Car getCar();

}
