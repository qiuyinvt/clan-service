package com.start.coc.service.service;

import java.io.Serializable;
import java.util.HashMap;
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
	public PK deleteByPrimaryKey(PK id){
		return baseDao.deleteByPrimaryKey(id);
	}

	@Override
	public PK insert(T record) {	
		return (PK)baseDao.insert(record);
	}

	@Override
	public PK insertSelective(T record) {		
		return baseDao.insertSelective(record);
	}

	@Override
	public T selectByPrimaryKey(PK id) {		
		return baseDao.selectByPrimaryKey(id);
	}

	@Override
	public PK updateByPrimaryKeySelective(T record) {		
		return baseDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public PK updateByPrimaryKey(T record) {		
		return baseDao.updateByPrimaryKey(record);
	}

}
