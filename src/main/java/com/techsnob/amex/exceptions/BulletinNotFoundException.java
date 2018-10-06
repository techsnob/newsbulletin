package com.techsnob.amex.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BulletinNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 770119008639366289L;

	public BulletinNotFoundException(String message) {
		super(message);
	}
	
}
