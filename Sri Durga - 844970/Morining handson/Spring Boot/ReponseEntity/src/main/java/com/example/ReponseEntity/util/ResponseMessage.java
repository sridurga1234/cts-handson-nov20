package com.example.ReponseEntity.util;

public class ResponseMessage {
	private int statusCode;
	private String description;
	

	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(Object object) {
		this.description = (String) object;
	}



}