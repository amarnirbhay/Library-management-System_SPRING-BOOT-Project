package com.jsp.librarymanagmentsystemminiproject.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mainadmin")
public class Admin {
	
	@Id
	@Column(name = "adminid")
	private int adminId;
	@Column(name = "adminname")
	private String adminName;
	@Column(name = "adminemail")
	private String adminEmail;
	@Column(name = "adminphone")
	private Long adminPhone;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public Long getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(Long adminPhone) {
		this.adminPhone = adminPhone;
	}
}

