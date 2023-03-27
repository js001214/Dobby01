package com.dobby.entity;

import java.time.LocalDateTime;

import com.dobby.constant.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;
	
	private String email;
	
	private String password;
	
	private String name;
	
	private String phone;
	
	//등록일
	private LocalDateTime regDate;
	//수정일
	private LocalDateTime modifyDate;
	//삭제일
	private LocalDateTime deleteDate;
	
	//삭제여부
	private Boolean delete;
	
	//권한
	private Role role;
	
	
	@ManyToOne
	//출퇴근	ID
	private  Commute commuteId;
	
	@ManyToOne
	//근무일지 ID
	private  WorkLog workLogId;
	
	
	
}
