package com.start.coc.service.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import com.start.coc.service.dao.BaseDao;
import com.start.coc.service.utils.Find;

public abstract class TestService<T , PK extends Serializable> {		
	
	/*public List<T> getByFind(Find find,BaseDao<T , PK> baseDao) {			
		return baseDao.getByFind(find.getMap());
	}

	public List<T> getByFind(Map map,BaseDao<T , PK> baseDao) {		
		return baseDao.getByFind(map);
	}	
	
	public PK deleteByPrimaryKey(PK id,BaseDao<T , PK> baseDao){
		return baseDao.deleteByPrimaryKey(id);
	}

	public PK insert(T record,BaseDao<T , PK> baseDao) {	
		return baseDao.insert(record);
	}

	public PK insertSelective(T record,BaseDao<T , PK> baseDao) {		
		return baseDao.insertSelective(record);
	}

	public T selectByPrimaryKey(PK id,BaseDao<T , PK> baseDao) {		
		return baseDao.selectByPrimaryKey(id);
	}

	public PK updateByPrimaryKeySelective(T record,BaseDao<T , PK> baseDao) {		
		return baseDao.updateByPrimaryKeySelective(record);
	}

	public PK updateByPrimaryKey(T record,BaseDao<T , PK> baseDao) {		
		return baseDao.updateByPrimaryKey(record);
	}*/
}
