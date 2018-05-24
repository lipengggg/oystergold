package com.itoystergold.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itoystergold.mapper.UserMapper;
import com.itoystergold.pojo.User;
import com.itoystergold.pojo.UserExample;
import com.itoystergold.service.DemoUserService;

@Service
public class DemoUserServiceImpl implements DemoUserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> selectUser() {
		UserExample userExample=new UserExample();
		return userMapper.selectByExample(userExample);
	}

}
