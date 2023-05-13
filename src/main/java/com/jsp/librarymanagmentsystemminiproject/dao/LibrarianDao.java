package com.jsp.librarymanagmentsystemminiproject.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.librarymanagmentsystemminiproject.dto.Librarian;
import com.jsp.librarymanagmentsystemminiproject.repository.LibrarianRepository;

@Repository
public class LibrarianDao {

	@Autowired
	LibrarianRepository librarianRepository;

	// This Method to save Librarian Data
	public Librarian saveLibrarian(Librarian librarian) {

		return librarianRepository.save(librarian);
	}

	// update Method to update any data of librarian

	public Librarian updateLibrarian(Librarian librarian, int librarianId) {

		Optional<Librarian> optional = librarianRepository.findById(librarianId);

		if (optional.isPresent()) {

			Librarian librarian2 = optional.get();

			if ((librarian.getLibrarianName() != null) && (librarian.getLibrarianEmail() != null)) {

				librarian2.setLibrarianName(librarian.getLibrarianName());

				librarian2.setLibrarianEmail(librarian.getLibrarianEmail());

				librarianRepository.save(librarian2);
			} else if (librarian.getLibrarianName() != null) {
				librarian2.setLibrarianName(librarian.getLibrarianName());

				librarianRepository.save(librarian2);
				return librarian2;

			} else {

				librarian2.setLibrarianEmail(librarian.getLibrarianEmail());

				librarianRepository.save(librarian2);
				return librarian2;
			}

		}
		return null;
	}

}
