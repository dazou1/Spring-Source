package prototype;

/**
 * @Author dazou
 * @Date 2019-06-26 21:07
 */

/**
 * 原型模型
 * 创建一个一模一样的对象，并且具有新对象具有原对象一样的属性值
 * 不使用构造器构建新对象，而是使用字节码直接生成
 */

/**
 * 浅拷贝：能够直接拷贝其实际内容的数据类型，八大基本数据类型 + String
 */
public class PrototypeTest {

	public static void main(String[] args) {

		ConcretePrototype cp = new ConcretePrototype();
		cp.setAge(18);

		ConcretePrototype copy = (ConcretePrototype) cp.clone();
		System.out.println(copy == cp);
		System.out.println(copy.list == cp.list);
		System.out.println(copy.getAge() + " " + copy.list.size());
	}
}
