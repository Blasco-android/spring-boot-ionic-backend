package com.blascoweb.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	//Metodo para adicionar o nome e menssagem do erro.
	public void addError(String fieldName, String messsage) {
		errors.add(new FieldMessage(fieldName, messsage));
	}	

}
