package cn.zybwz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zybwz.service.UserService;
import cn.zybwz.utils.RedisConn;


@Controller
public class UserController {
	@Autowired
	private UserService userservice;
	@Autowired
	private RedisConn redisconn;
	
	@RequestMapping(value = "/signin.action")
	public @ResponseBody String CodeCheck(String UserName) {
		return userservice.SignIn(UserName);		
	}
}
