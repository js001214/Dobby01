package com.dobby.cList.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dobby.entity.Company;

public interface CListRepository extends JpaRepository<Company, Long> {
	
	List<Company> findAll();
	
}
