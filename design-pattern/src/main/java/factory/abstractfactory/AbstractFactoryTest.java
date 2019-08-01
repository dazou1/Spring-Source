package factory.abstractfactory;

/**
 * @Author dazou
 * @Date 2019-06-26 17:31
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		DefaultFactory factory = new DefaultFactory();
		System.out.println(factory.getCar("BMW").getName());
	}
}
