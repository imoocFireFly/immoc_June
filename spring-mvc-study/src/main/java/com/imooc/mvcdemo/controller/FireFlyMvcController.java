package com.imooc.mvcdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/firefly")
public class FireFlyMvcController {

	private static Logger log = LoggerFactory.getLogger(FireFlyMvcController.class);

	
	@RequestMapping("/mvc")
	// host:8080/firefly/mvc
	public String fireFlyMvc() {
		//yingbao.jsp
		log.debug("firefly  Controller");
		return "yingbao";
	}
	
}
