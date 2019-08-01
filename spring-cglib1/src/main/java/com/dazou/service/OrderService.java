package com.dazou.service;

import com.dazou.dao.CityDao;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author dazou
 * @Date 2019-06-11 12:55
 */

@Component
public class OrderService {

	@Autowired
	CityService cityService;

	public OrderService() {
		System.out.println("Constructor1");
	}

	public OrderService(CityService cityService) {
		System.out.println("Constructor2");
	}

	public OrderService(CityService cityService, TestService testService) {
		System.out.println("Constructor3");
	}


//	@Autowired
//	CityDao cityDao;

//	@PostConstruct
//	public void lubanInit() {
//		System.out.println("init");
//	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("init for afterPropertiesSet");
//	}
}
