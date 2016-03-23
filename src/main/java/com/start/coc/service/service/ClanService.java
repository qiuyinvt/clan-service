package com.start.coc.service.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.start.coc.service.dao.ClanMapper;
import com.start.coc.service.model.Clan;


@Transactional
@Service
public class ClanService extends BaseService<Clan, Integer> implements ClanMapper{

}
