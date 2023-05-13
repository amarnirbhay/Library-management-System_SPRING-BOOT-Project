package com.jsp.librarymanagmentsystemminiproject.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "libraian")
public class Librarian {

	@Id
	@Column(name = "librarianid")
	private int librarianId;
	@Column(name = "librarianname")
	private String librarianName;
	@Column(name = "librarianemail")
	private String librarianEmail;
	public int getLibrarianId() {
		return librarianId;
	}
	public void setLibrarianId(int librarianId) {
		this.librarianId = librarianId;
	}
	public String getLibrarianName() {
		return librarianName;
	}
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}
	public String getLibrarianEmail() {
		return librarianEmail;
	}
	public void setLibrarianEmail(String librarianEmail) {
		this.librarianEmail = librarianEmail;
	}
}
