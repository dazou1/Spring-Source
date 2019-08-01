package com.dazou.app;

import com.dazou.spring.ImportBeanDefinitionRegistart;
import org.springframework.context.annotation.Import;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author dazou
 * @Date 2019-06-12 17:54
 */

@Retention(RetentionPolicy.RUNTIME)
@Import({ImportBeanDefinitionRegistart.class})
public @interface DazouScan {
}
