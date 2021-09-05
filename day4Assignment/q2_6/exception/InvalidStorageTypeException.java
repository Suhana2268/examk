package com.hsbc.day4Assignment.q2_6.exception;

public class InvalidStorageTypeException extends Exception{
	
	
	String excMessage = "storage type is invalid";

	/**
	 * 
	 */
	public InvalidStorageTypeException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public InvalidStorageTypeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param message
	 * @param cause
	 */
	public InvalidStorageTypeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param cause
	 */
	public InvalidStorageTypeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param excMessage
	 */
	public InvalidStorageTypeException(String excMessage) {
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
		return "InvalidStorageTypeException [excMessage=" + excMessage + "]";
	}
	
	
	
	

}
