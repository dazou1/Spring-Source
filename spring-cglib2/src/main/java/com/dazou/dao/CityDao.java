package com.dazou.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author dazou
 * @Date 2019-06-12 18:08
 */
public interface CityDao {

	@Select("select * from cityDao")
	public List<Map<String, Object>> query();
}
