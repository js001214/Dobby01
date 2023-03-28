package com.dobby.cList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dobby.cList.service.CListService;
import com.dobby.entity.Company;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/clist")
@Controller
public class CListController {
	
	private final CListService cListService;
	
	@GetMapping("/main")
	public String clist() {
		return "company/cList";
	}
	
	@PostMapping("/save")
    public Company saveCompany(@RequestBody Company company) {
        return cListService.saveCompany(company);
    }
	
}
