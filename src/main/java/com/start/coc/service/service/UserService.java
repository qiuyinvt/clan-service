package com.start.coc.service.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.start.coc.service.dao.UserMapper;
import com.start.coc.service.model.User;
import com.start.coc.service.utils.Find;

@Transactional
@Service
public class UserService implements UserDetailsService{
	@Autowired
	private UserMapper userDao;

	public Integer deleteByPrimaryKey(Integer id) {	
		return userDao.deleteByPrimaryKey(id);
	}

	public Integer insert(User record) {
		return userDao.insert(record);
	}

	public Integer insertSelective(User record) {		
		return userDao.insertSelective(record);
	}

	public User selectByPrimaryKey(Integer id) {	
		return userDao.selectByPrimaryKey(id);
	}

	public Integer updateByPrimaryKeySelective(User record) {		
		return userDao.updateByPrimaryKeySelective(record);
	}

	public Integer updateByPrimaryKey(User record) {		
		return userDao.updateByPrimaryKey(record);
	}

	//根据用户名获取账户
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {		
		User user = userDao.selectByPrimaryKey(13);		
		return user;
	}
}
