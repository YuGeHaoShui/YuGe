package cn.zy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zy.entity.User;
import cn.zy.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	private Logger log = Logger.getLogger(User.class);
	
	@Resource
	private UserService userservice;
	
	@RequestMapping(value="/index.html")
	public String login(String name,String pwd,HttpServletRequest request,HttpSession session) {
		User user = userservice.getLoginUser(name, pwd);
		if(user != null) {
			return "Login";
		}else {
			
		}
		return "index";
		
	}
}
