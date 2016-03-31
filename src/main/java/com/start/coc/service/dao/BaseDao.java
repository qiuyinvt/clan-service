package com.start.coc.service.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T, PK extends Serializable> {
	// T get(PK id);

	List<T> getByFind(Map find);

	void deleteByPrimaryKey(PK id);

	void insert(T record);

	void insertSelective(T record);

	T selectByPrimaryKey(PK id);

	void updateByPrimaryKeySelective(T record);

	void updateByPrimaryKey(T record);
}
