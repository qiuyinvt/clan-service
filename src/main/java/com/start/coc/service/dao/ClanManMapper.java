package com.start.coc.service.dao;

import java.util.List;
import java.util.Map;

import com.start.coc.service.model.ClanMan;

public interface ClanManMapper{
	List<ClanMan> getByFind(Map find);

	Long deleteByPrimaryKey(Long id);

	Long insert(ClanMan record);

	Long insertSelective(ClanMan record);

	ClanMan selectByPrimaryKey(Long id);

	Long updateByPrimaryKeySelective(ClanMan record);

	Long updateByPrimaryKey(ClanMan record);
}