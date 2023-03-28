package com.dobby.cList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dobby.entity.Company;

public interface CListRepository extends JpaRepository<Company, Long> {

}
