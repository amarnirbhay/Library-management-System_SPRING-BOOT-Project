package com.jsp.librarymanagmentsystemminiproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.librarymanagmentsystemminiproject.dto.Admin;
import com.jsp.librarymanagmentsystemminiproject.dto.ResponseStructure;
import com.jsp.librarymanagmentsystemminiproject.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class AdminController {

	@Autowired
	AdminService adminService;

	@Autowired
	HttpSession httpSession;
	
	@Autowired
	HttpServletRequest httpServletRequest;
	// saveAdmin
	@PostMapping("/saveAdminDetails")
	public ResponseStructure<Admin> saveAdmin(@RequestBody Admin admin) {

		return adminService.saveAdmin(admin);

	}
	@GetMapping(value = "/loginAdmin/{adminName}/{adminEmail}")
	public String getAllAdmin(@PathVariable String adminName, @PathVariable String adminEmail) {

		List<Admin> admins = adminService.getAllAdmins();

		for (Admin admin : admins) {

			if ((admin.getAdminName().equalsIgnoreCase(adminName))
					&& (admin.getAdminEmail().equalsIgnoreCase(adminEmail))) {

				httpSession.setAttribute("adminEmail",adminName);
				
				return "admin logged in seccessfully";
				
			}else {
				return  "Please Check Your UserName And password";
			}
		}
		return null;
	}
	
	@GetMapping(value = "/logoutAdmin")
	public String logoutAdmin() {
		
		if(httpSession.getAttribute("adminEmail")!=null) {
			
			httpSession.invalidate();
		}
		return "Admin Logout Successfully";
	}
}
