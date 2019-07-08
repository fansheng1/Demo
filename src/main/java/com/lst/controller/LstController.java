package com.lst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LstController {
	
	@RequestMapping("/index")
	public String index(){
		return "Spring boot Demo";
	}

}
