package com.jsp.librarymanagmentsystemminiproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.librarymanagmentsystemminiproject.dao.LibrarianDao;
import com.jsp.librarymanagmentsystemminiproject.dto.Librarian;
import com.jsp.librarymanagmentsystemminiproject.dto.ResponseStructure;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Service
public class LibrarianService {
		
	@Autowired
	LibrarianDao librarianDao;
	
	@Autowired
	HttpSession httpSession;
	
	@Autowired
	ResponseStructure<Librarian> responseStructure;
	
	@Autowired
	HttpServletRequest httpServletRequest;
	
	// This Method to save Librarian Data
	public ResponseStructure<Librarian> saveLibrarian(Librarian librarian) {
		
		if(httpSession.getAttribute("adminEmail") != null) {
			
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setMsg("Librarian-data-Added");
			responseStructure.setData(librarian);
			librarianDao.saveLibrarian(librarian);
			
			return responseStructure;
		}else {
			
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			responseStructure.setMsg("Please-login-with-admin");
			responseStructure.setData(null);
//			librarianDao.saveLibrarian(librarian);
			return responseStructure;
		}
		
	}
	// update Method to update any data of librarian

		public ResponseStructure<Librarian> updateLibrarian(Librarian librarian, int librarianId) {
			
			if(httpSession.getAttribute("adminEmail")!=null) {
				
			Librarian librarian2=librarianDao.updateLibrarian(librarian, librarianId);
			responseStructure.setStatusCode(HttpStatus.ACCEPTED.value());
			responseStructure.setMsg("Data-Updated-Successfully...");
			responseStructure.setData(librarian2);
			
			return responseStructure;
			}
			else {
				responseStructure.setStatusCode(HttpStatus.ACCEPTED.value());
				responseStructure.setMsg("Please Login With Admin then Update");
				responseStructure.setData(null);
				
				return responseStructure;
			}
			
		}
}
