package com.itoystergold.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itoystergold.service.DemoUserService;

@Controller
public class UserController {
	
	
	@RequestMapping("/user")
	public String selectUser() {
		
		/*System.out.println(demoUserService.selectUser());*/
		return "index";
	}
}
