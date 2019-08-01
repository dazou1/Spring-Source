package proxy.jdk;

/**
 * @Author dazou
 * @Date 2019-06-23 16:30
 */

/**
 * 原理：
 * 1、拿到被代理对象的引用，然后获取他的接口；
 * 2、JDK动态代理重新生成一个类，这个类实现了我们给的被代理对象的接口；
 * 3、把被代理对象的引用拿到了
 * 4、重新动态生成了一个class字节码
 * 5、最后编译
 */
public class Test {

    public static void main(String[] args) {

        try {
            Person p = (Person) new Huangniu().getInstance(new Dazou());
            System.out.println("代理后生成的代理对象是：" + p.getClass());
            System.out.println();
            p.maipiao();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
