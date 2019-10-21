package com.comakeit.mrbs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class MRBSNoContentFoundException extends RuntimeException {

	private static final long serialVersionUID = 204L;

	public MRBSNoContentFoundException() {
		super();
	}

	public MRBSNoContentFoundException(String message) {
		super(message);
	}

}
