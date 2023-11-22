package org.mvazquez.api.apisaludos.services;

public class CRUDException extends Exception{

	/*
	 * Esta clase nos permite invocarla en las clase Services para mandar mensajes de error.  
	 */
	private static final long serialVersionUID = 1L;
	
	public CRUDException(String message) {
		super(message);
	}	
}