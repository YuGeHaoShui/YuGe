package cn.zy.dao;

import cn.zy.entity.User;

public interface UserMapper {
	User getLoginUser(String name);
}
