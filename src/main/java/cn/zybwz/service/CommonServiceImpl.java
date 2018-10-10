package cn.zybwz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zybwz.dao.CommonMapper;

@Service
public class CommonServiceImpl implements CommonService{

	@Autowired
	CommonMapper commonMapper;
}
