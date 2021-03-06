package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	//스프링이 Dispatcher 하기위해 ModelAndView를 줌. 이 클래스에서는 Dispatcher기능이 없음
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView("root.index");
		mv.addObject("data","Hello Spring MVC");
		
		return mv;
	}

}
