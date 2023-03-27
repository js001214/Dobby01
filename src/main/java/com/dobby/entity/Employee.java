package com.dobby.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	
	//회원 이름
	private String name;
	
	
	//회원 이메일
	private String email;
	
	//회원 번호
	private String phone;
	
	//등록일
	private LocalDateTime regDate;
	//수정일
	private LocalDateTime modifyDate;
	//삭제일
	private LocalDateTime deleteDate;
	
	//삭제여부
	private Boolean delete;
	
	//부서 idx
	@ManyToOne
	private Department dId;

	//회사 idx
	@ManyToOne
	private Department cpId;

	
	//회원 idx
	@ManyToOne
	private Department userId;

	
}
