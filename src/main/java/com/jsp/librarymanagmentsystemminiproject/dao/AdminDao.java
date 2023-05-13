package com.jsp.librarymanagmentsystemminiproject.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.librarymanagmentsystemminiproject.dto.Admin;
import com.jsp.librarymanagmentsystemminiproject.repository.AdminRepository;

@Repository
public class AdminDao {

	@Autowired
	AdminRepository adminRepository;

	// saveAdmin
	public void saveAdmin(Admin admin) {

		adminRepository.save(admin);
	}

	// deleteAdmin
	public void deleteAdmin(int id) {
		Optional<Admin> optional = adminRepository.findById(id);
		if (optional.isPresent()) {
			Admin admin = optional.get();
			adminRepository.delete(admin);
			System.out.println("Data deleted");
		}
	}

//	this Method will fetch the data from mainadmin table
	public List<Admin> getAllAdmins() {

		return adminRepository.findAll();

	}

}
