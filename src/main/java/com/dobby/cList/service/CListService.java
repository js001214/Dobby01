package com.dobby.cList.service;

import org.springframework.stereotype.Service;

import com.dobby.cList.repository.CListRepository;
import com.dobby.entity.Company;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CListService {
	
	private final CListRepository clistrepository;
	
	 public Company saveCompany(Company company) {
	        return clistrepository.save(company);
	    }
	
}
