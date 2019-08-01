package singleton;

/**
 * @Author dazou
 * @Date 2019-06-26 19:48
 */
public class Singleton2 {

	/**
	 * 使用volatile是为了防止指令重排序，因为singleton1 = new Singleton1();由3步形成
	 * （1）分配内存空间
	 * （2）初始化对象
	 * （3）将singleton对象指向分配的内存地址
	 * 如果没有使用volatile，第3步可能被重排序在第2步前面，使得此时另外一个线程到来时，认为singleton不为空，
	 * 直接返回还未初始化的singleton，产生错误。
	 */
	private static volatile Singleton2 INSTANCE;

	private Singleton2() {

	}

	public static Singleton2 getInstance() {

		//第一次校验，避免了进入synchronized块所需要花费的资源，
		// 有一次实例化成功后，以后的都将直接获取到该实例，不用竞争锁
		if (INSTANCE == null) {
			synchronized (Singleton2.class) {
				//第二次校验，避免多次实例化，因为可能出现第一次多个线程都判断实例为null，一个线程实例化完成后释放锁之后，
				//如果不进行第二次校验的话，其他获取到锁的线程也将进行实例化对象。
				if (INSTANCE == null) {
					INSTANCE = new Singleton2();
				}
			}
		}

		return INSTANCE;
	}

}
