package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author dazou
 * @Date 2019-06-23 16:20
 */
public class Huangniu implements InvocationHandler {


    Person target;

    public Object getInstance(Person target) throws Exception {
        // 1
        this.target = target;

        System.out.println("被代理的对象是：" + target.getClass());
        // 2
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是黄牛，我可以帮忙买票，但是需要给中间费喔！");
        System.out.println("-------------------");
        // 3
//        this.target.maipiao();

        method.invoke(this.target, args);

        System.out.println("-------------------");
        System.out.println("付款！");

        return null;
    }
}
