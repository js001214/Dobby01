package com.dobby.cList.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dobby.cList.repository.CListRepository;
import com.dobby.entity.Company;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CListService {
	
	private final CListRepository cListRepository;
	
	public List<Company> companyList(){
		return cListRepository.findAll();
	}
	
	
	public Company saveCompany(Company company) {
		return cListRepository.save(company);
	}
	
}
