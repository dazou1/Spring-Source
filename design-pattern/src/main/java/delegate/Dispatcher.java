package delegate;

/**
 * @Author dazou
 * @Date 2019-06-26 20:17
 */

/**
 * 委派模式在Spring的使用
 * IOC容器的register方法（为了告诉容器，在一个类的初始化过程中，需要做很多不同的逻辑处理，
 * 这就需要实现多个任务执行者，分别实现各自的功能）
 */
public class Dispatcher implements IExecutor {

	IExecutor executor;

	public Dispatcher(IExecutor executor) {
		this.executor = executor;
	}

	/**
	 * 项目经理也实现了执行者接口，即他也是一个执行者
	 * 但是他的工作职责不一样,他会委派普通员工进行实际的任务执行
	 */
	@Override
	public void doing() {
		this.executor.doing();
	}
}
