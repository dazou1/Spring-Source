package delegate;

/**
 * @Author dazou
 * @Date 2019-06-26 20:14
 */
public class ExecutorA implements IExecutor {
	@Override
	public void doing() {
		System.out.println("员工A执行任务！");
	}
}
