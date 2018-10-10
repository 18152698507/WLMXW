package cn.zybwz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.zybwz.dao.UserMapper;


@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	UserMapper userMapper;

	@Override
	public String SignIn(String username) {
		// TODO Auto-generated method stub
		return userMapper.SignIn(username);
	}

}
