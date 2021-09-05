package com.hsbc.day4Assignment.q2_6.exception;

public class EmployeeAlreadyExistException extends Exception{
	
	String excMessage = "Employee already exist";

	/**
	 * 
	 */
	public EmployeeAlreadyExistException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public EmployeeAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EmployeeAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public EmployeeAlreadyExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param excMessage
	 */
	public EmployeeAlreadyExistException(String excMessage) {
		super();
		this.excMessage = excMessage;
	}

	/**
	 * @return the excMessage
	 */
	public String getExcMessage() {
		return excMessage;
	}

	/**
	 * @param excMessage the excMessage to set
	 */
	public void setExcMessage(String excMessage) {
		this.excMessage = excMessage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeAlreadyExistException [excMessage=" + excMessage + "]";
	}
	
	

}
