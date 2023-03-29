package com.dobby.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Company extends BaseTimeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	
	//회사이름
	private String cname;
	
	//회사주소
	private String address;
	
	//사업자 등록번호
	private String cn;
	
	//회사번
	private String number;
	
	//사업자
	private String name;
	
	//등록일
//	private LocalDateTime regDate;
	//수정일
//	private LocalDateTime modifyDate;
	//삭제일
//	private LocalDateTime deleteDate;

	
	//삭제여부
	private Boolean delete;
	
	@OneToMany
	private List<Users> userId; 

}