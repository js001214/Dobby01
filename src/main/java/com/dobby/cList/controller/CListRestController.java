package com.dobby.cList.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dobby.cList.service.CListService;
import com.dobby.entity.Company;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class CListRestController {
	
	private final CListService cListService;
	
	@GetMapping("/posts")
    public List<Company> getCompany() {
        return cListService.companyList();
    }
	
}
