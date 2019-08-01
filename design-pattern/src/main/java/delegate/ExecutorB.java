package delegate;

/**
 * @Author dazou
 * @Date 2019-06-26 20:15
 */
public class ExecutorB implements IExecutor {
	@Override
	public void doing() {
		System.out.println("员工B执行任务！");
	}
}
