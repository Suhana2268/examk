package com.hsbc.day4Assignment.q3.AgeValidator;

public class InvalidAgeException extends Exception{
	
	String excMessage = "Please enter valid age";

	/**
	 * 
	 */
	public InvalidAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public InvalidAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public InvalidAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public InvalidAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param excMessage
	 */
	public InvalidAgeException(String excMessage) {
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
		return "InvalidAgeException [excMessage=" + excMessage + "]";
	}
	
	

}
