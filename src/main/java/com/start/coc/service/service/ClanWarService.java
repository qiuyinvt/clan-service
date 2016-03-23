package com.start.coc.service.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.start.coc.service.dao.ClanWarMapper;
import com.start.coc.service.model.ClanWar;


@Transactional
@Service
public class ClanWarService extends BaseService<ClanWar, Integer> implements ClanWarMapper{

}
