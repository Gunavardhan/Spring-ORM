package com.ormpra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ormpra.dao.IUser;
import com.ormpra.pojo.User;

@Controller
public class UserController {
	@Autowired
	IUser userDao = null;
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public ModelAndView userReg(User user){
		userDao.userReg(user);
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		model.addObject("username", user.getName() + " : Registration Successfully Done");
		return model;
	}

}
