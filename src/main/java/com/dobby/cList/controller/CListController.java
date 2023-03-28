package com.dobby.cList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/clist")
@Controller
public class CListController {
	
	@GetMapping("/")
	public String index() {
		
		return "company/cList";
	}
	
}
