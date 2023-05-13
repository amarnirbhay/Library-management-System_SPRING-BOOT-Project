package com.jsp.librarymanagmentsystemminiproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.librarymanagmentsystemminiproject.dao.AdminDao;
import com.jsp.librarymanagmentsystemminiproject.dto.Admin;
import com.jsp.librarymanagmentsystemminiproject.dto.ResponseStructure;

@Service
public class AdminService {
	
	@Autowired
	AdminDao adminDao;
	
	@Autowired
	ResponseStructure<Admin> saveAdmin;
	
	//saveAdmin	
	public ResponseStructure<Admin> saveAdmin(Admin admin) {
		
		if(admin != null) {

			saveAdmin.setStatusCode(HttpStatus.CREATED.value());
			saveAdmin.setMsg("Data Inserted SuccessFully");
			saveAdmin.setData(admin);
			
			adminDao.saveAdmin(admin);
			return saveAdmin;
		}
		else {
			saveAdmin.setStatusCode(HttpStatus.CREATED.value());
			saveAdmin.setMsg("Please Check Your Data");
			saveAdmin.setData(admin);
			
//			adminDao.saveAdmin(admin);
			return saveAdmin;
		}
	}
		
//	this Method will fetch the data from mainadmin table
	public List<Admin> getAllAdmins(){
		return adminDao.getAllAdmins();
	}

		
		
		
}
