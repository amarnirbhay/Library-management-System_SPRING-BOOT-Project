 package com.jsp.librarymanagmentsystemminiproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.librarymanagmentsystemminiproject.dto.Admin;

public interface AdminRepository  extends JpaRepository<Admin, Integer>	{
	
}
