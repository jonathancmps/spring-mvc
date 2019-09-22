package com.mballen.curso.boot.ewb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {
	
	@GetMapping("/")
	public String homme() {
		return("/home");
	}
	

}
