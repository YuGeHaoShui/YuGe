package cn.zy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.zy.dao.UserMapper;
import cn.zy.entity.User;
import cn.zy.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper usermapper;
	
	@Override
	public User getLoginUser(String name, String pwd) {
		User admin = usermapper.getLoginUser(name);
		 
		if(admin !=null) {
			if(admin.getPwd().equals(pwd)) {
				
				return admin;
			}
		}
		return null;
	}

}
