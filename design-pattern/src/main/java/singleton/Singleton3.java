package singleton;

/**
 * @Author dazou
 * @Date 2019-06-08 20:48
 */

/**
 * 线程安全，调用效率高，不能延时加载(可以将枚举类作为内部类就可以实现延迟加载了)，可以天然的防止反射和反序列化调用
 *
 * 使用枚举类型实现单例：单元素的枚举类型已经成为实现Singleton的最佳方法。
 *  （1）调用SingletonEnum.INSTANCE.getInstance() 即可获得所要实例。
 *  （2）枚举中明确了构造方法限制为私有，在访问枚举实例时会执行构造方法，同时每个枚举实例都是static final类型的，
 *  也就表明只能被实例化一次。在调用构造方法时单例被实例化。
 *  （3）enum中的实例被保证只会被实例化一次，所以instance也被保证实例化一次。
 *   (4)JVM会保证enum不能被反射并且构造器方法只执行一次，但枚举会很耗内存，
 */

public class Singleton3 {

	/**
	 * 私有化构造方法
	 */
	private Singleton3() {

	}

	/**
	 * 利用内部类实现延迟加载，在调用第二个 getInstance() 时，触发这个内部内部枚举类的加载，枚举类加载的时候，
	 * 就实例化 INSTANCE，使用设置的构造方法实例化，这时就间接地实例化了 Singleton3 了，并将实例化后的对象赋值给了 instance，
	 * 外部就可以间接通过第二个 getInstance() 方法获取到这个 instance。
	 */
	private enum SingletonEnum {
		// INSTANCE 就是相当于一个 SingletonEnum 实例，在加载的时候实例化一次，只实例化一次，并且是一个常量
		INSTANCE;

		private Singleton3 instance;

		/**
		 * JVM会保证此方法绝对只调用一次
		 */
		SingletonEnum() {
			instance = new Singleton3();
		}

		private Singleton3 getInstance() {
			return instance;
		}
	}

	public static Singleton3 getInstance() {
		return SingletonEnum.INSTANCE.getInstance();
	}


}



/**
 * 也有的是这样写，非懒加载
 * 使用枚举除了线程安全和防止反射强行调用构造器之外，还提供了自动序列化机制，防止反序列化的时候创建新的对象。
 */
enum Singleton {
	// INSTANCE 就是一个 Singleton 对象，在加载的时候就实例化了，只实例化一次，是一个常量。
	INSTANCE;

	public Singleton getInstance(){
		return INSTANCE;
	}
}
