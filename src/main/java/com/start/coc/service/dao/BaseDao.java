package com.start.coc.service.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.start.coc.service.utils.Find;

public interface BaseDao<T, PK extends Serializable> {
	// T get(PK id);

	List<T> getByFind(Map find);

	PK deleteByPrimaryKey(PK id);

	PK insert(T record);

	PK insertSelective(T record);

	T selectByPrimaryKey(PK id);

	PK updateByPrimaryKeySelective(T record);

	PK updateByPrimaryKey(T record);
}
