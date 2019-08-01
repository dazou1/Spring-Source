package singleton;

/**
 * @Author dazou
 * @Date 2019-06-26 19:34
 */

/**
 * 内部静态类实现单例模式
 * 懒汉加载，线程安全
 * 利用内部类初始化特性：
 * （1）静态内部类和非静态内部类一样，都是在被调用时才会被加载，所以可以延时加载
 * （2）加载静态内部类的时候，其实还会先加载外部类，才加载静态内部类
 */
public class Singleton1 {

	/**
	 * 私有化构造方法，防止外部实例化
	 */
	private Singleton1() {

	}

	/**
	 * private 保证不受外部修改
	 * static 保证全局唯一
	 */
	private static class SingletonHolder {
		/**
		 * final 防止内部误操作
		 */
		 private static final Singleton1 INSTANCE = new Singleton1();
	}

	/**
	 * final 确保不会被覆盖
	 * @return
	 */
	public static final Singleton1 getInstance() {

		//方法中的逻辑在调用时才执行，并且其需要的内存空间也在调用的时候才分配
		return SingletonHolder.INSTANCE;
	}
}
