package com.start.coc.service.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.start.coc.service.dao.BaseDao;
import com.start.coc.service.utils.Find;


public class BaseService<T, PK extends Serializable> implements BaseDao<T, PK>{
	@Autowired
	private BaseDao<T , PK>  baseDao;	
	
	/*public T get(PK id) {		
		return baseDao.get(id);
	}*/
	
	public List<T> getByFind(Find find) {			
		return baseDao.getByFind(find.getMap());
	}

	@Override
	public List<T> getByFind(Map map) {		
		return baseDao.getByFind(map);
	}	
	
	@Override
	public void deleteByPrimaryKey(PK id){
		baseDao.deleteByPrimaryKey(id);
	}

	@Override
	public void insert(T record) {	
		baseDao.insert(record);
	}

	@Override
	public void insertSelective(T record) {		
		baseDao.insertSelective(record);
	}

	@Override
	public T selectByPrimaryKey(PK id) {		
		return baseDao.selectByPrimaryKey(id);
	}

	@Override
	public void updateByPrimaryKeySelective(T record) {		
		baseDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public void updateByPrimaryKey(T record) {		
		baseDao.updateByPrimaryKey(record);
	}

}
