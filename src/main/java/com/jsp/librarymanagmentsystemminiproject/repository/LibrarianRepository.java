package com.jsp.librarymanagmentsystemminiproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.librarymanagmentsystemminiproject.dto.Librarian;

public interface LibrarianRepository extends JpaRepository<Librarian, Integer> {
		
	
}
