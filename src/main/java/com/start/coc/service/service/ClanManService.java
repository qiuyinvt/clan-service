package com.start.coc.service.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.start.coc.service.dao.ClanManMapper;
import com.start.coc.service.model.ClanMan;
import com.start.coc.service.utils.Find;

@Transactional
@Service
public class ClanManService{
	@Autowired
	private ClanManMapper clanManDao;
	
	public List<ClanMan> getByFind(Find find) {		
		return getByFind(find.getMap());
	}
	
	public List<ClanMan> getByFind(Map map) {		
		return clanManDao.getByFind(map);
	}

	public Long deleteByPrimaryKey(Long id) {	
		return clanManDao.deleteByPrimaryKey(id);
	}

	public Long insert(ClanMan record) {
		return clanManDao.insert(record);
	}

	public Long insertSelective(ClanMan record) {		
		return clanManDao.insertSelective(record);
	}

	public ClanMan selectByPrimaryKey(Long id) {	
		return clanManDao.selectByPrimaryKey(id);
	}

	public Long updateByPrimaryKeySelective(ClanMan record) {		
		return clanManDao.updateByPrimaryKeySelective(record);
	}

	public Long updateByPrimaryKey(ClanMan record) {		
		return clanManDao.updateByPrimaryKey(record);
	}
}
