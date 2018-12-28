package com.linshang.code.generator.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BuilderController {
	
	
	
	@RequestMapping("/code/demo")
	public ModelAndView demo(){
		ModelAndView view = new ModelAndView("default/demo");
		return view ;
	}
	
	
	
}
