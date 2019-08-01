package prototype;

import java.util.ArrayList;

/**
 * @Author dazou
 * @Date 2019-06-26 21:05
 */
public class Prototype implements Cloneable{

	public ArrayList<String> list = new ArrayList<>();

	@Override
	public Object clone() {
		Prototype prototype = null;

		try {
			//默认的clone，是浅拷贝，只复制基本数据类型或是String类型
			prototype = (Prototype) super.clone();
			//深拷贝，其他数据类型需要另外处理
			prototype.list = (ArrayList<String>) list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return prototype;
	}
}
