package com.mycompany.samples.example.ws.dto;

import java.io.Serializable;

public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;

	public Message() {
	}

	public Message(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}

}
