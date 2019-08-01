import com.dazou.app.AppConfig;
import com.dazou.dao.CityDao;
import com.dazou.service.CityService;
import com.dazou.spring.DazouInvocationHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @Author dazou
 * @Date 2019-06-11 11:03
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ac.getBean(CityDao.class).query();

	}
}
