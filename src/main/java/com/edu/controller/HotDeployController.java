package com.edu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* @ClassName: HotDeployController 
* @Description: TODO() 
* @author zhangxueqing
* @date 2017年11月26日 下午8:16:49 
*/
@Controller
public class HotDeployController{

	@RequestMapping(value="/say",method=RequestMethod.GET)
	public String say(HttpServletRequest request) {
		request.setAttribute("say","Hello world,hi,I love spring boot very much!");
		return "world";
	}
}
