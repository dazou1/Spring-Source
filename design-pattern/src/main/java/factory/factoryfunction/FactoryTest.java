package factory.factoryfunction;

/**
 * @Author dazou
 * @Date 2019-06-26 17:12
 */
public class FactoryTest {

	public static void main(String[] args) {

		/**
		 * 工厂方法模式，更接近现实生活
		 * 需要用户关心具体的生厂商，增加了代码的使用复杂度
		 * 各个产品的生厂商，都有各自的工厂
		 * 每个工厂具体的实现细节不一致
		 */
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar().getName());

		factory = new BenzFactory();
		System.out.println(factory.getCar().getName());
	}
}
