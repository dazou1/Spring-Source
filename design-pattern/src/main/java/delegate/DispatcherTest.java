package delegate;

/**
 * @Author dazou
 * @Date 2019-06-26 20:23
 */

/**
 * 委派模式，只关心结果，不关心过程，结果不一样
 * 委派人持有被委派人的引用
 * 主要目的是隐藏具体实现逻辑
 */
public class DispatcherTest {

	public static void main(String[] args) {

		/**
		 * 项目经理是委派人，普通员工是被委派人
		 * 委派人持有被委派人的引用
		 */
		Dispatcher dispatcher = new Dispatcher(new ExecutorA());

		/**
		 * 看上去是项目经理在干活，实际上是普通员工在干活
		 * 这就是典型的，干活是我的，功劳是你的
		 */
		dispatcher.doing();
	}
}
