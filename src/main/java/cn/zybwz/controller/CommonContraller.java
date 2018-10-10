package cn.zybwz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import cn.zybwz.service.CommonService;
import cn.zybwz.service.UserService;
import cn.zybwz.utils.RedisConn;

@Controller
public class CommonContraller {
	
	@Autowired
	private UserService userservice;
	@Autowired
	private CommonService commonservice;
	@Autowired
	private RedisConn redisconn;
		
}
