package proxy.cglib;

/**
 * @Author dazou
 * @Date 2019-06-26 16:03
 */
public class Test {

	public static void main(String[] args) {
		Dazou dazou = (Dazou)new Huangniu().getInstance(Dazou.class);
		dazou.maipiao();
	}
}
