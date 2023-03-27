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
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	
	//부서이름
	private String dname;
	
	//등록일
	private LocalDateTime regDate;
	//수정일
	private LocalDateTime modifyDate;
	//삭제일
	private LocalDateTime deleteDate;
	
	//삭제여부
	private Boolean delete;
	
	//회사idx
	@ManyToOne
	private Company cpId;
	
	@ManyToOne
	private Company userId;
	
	

}
