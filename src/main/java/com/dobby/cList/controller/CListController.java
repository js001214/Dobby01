package com.dobby.cList.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dobby.cList.service.CListService;
import com.dobby.entity.Company;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/clist")
@Controller
public class CListController {
	
	private final CListService cListService;
	
	@GetMapping("/main")
	public String clist(Model model) {
		
		List<Company> cList = cListService.companyList();
		
		model.addAttribute("list", cList);
		
		return "company/cList";
	}
	
	@PostMapping("/save")
    public @ResponseBody Company saveCompany(@RequestBody Company company) {
        return cListService.saveCompany(company);
    }
	
	 
	
}