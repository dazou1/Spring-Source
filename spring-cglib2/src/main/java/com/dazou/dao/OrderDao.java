package com.dazou.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author dazou
 * @Date 2019-06-12 19:04
 */
public interface OrderDao {

	@Select("select * from orderDao")
	public List<Map<String, Object>> query();
}
