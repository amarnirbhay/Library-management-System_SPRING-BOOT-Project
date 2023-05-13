package com.jsp.librarymanagmentsystemminiproject.dto;

import org.springframework.stereotype.Component;

@Component
public class ResponseStructure<T> {
		
	private int StatusCode;
	private String msg;
	private T data;
	public int getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(int statusCode) {
		StatusCode = statusCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
