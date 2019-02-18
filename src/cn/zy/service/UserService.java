package cn.zy.service;

import cn.zy.entity.User;

public interface UserService {
	User getLoginUser(String name,String pwd);
}
