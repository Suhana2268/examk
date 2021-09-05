package com.hsbc.day4Assignment.q1;

public class ElectronicDevice {
	
	/**
	 * attributes
	 */
	private int deviceId;
	private String deviceName;
	private String brand;
	private double screenSize;
	private double price;
	
	
	
	
	/**
	 * Constructor
	 */
	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param deviceId
	 * @param deviceName
	 * @param brand
	 * @param screenSize
	 * @param price
	 */
	public ElectronicDevice(int deviceId, String deviceName, String brand, double screenSize, double price) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.brand = brand;
		this.screenSize = screenSize;
		this.price = price;
	}
	

	/**
	 * @return the deviceId
	 */
	public int getDeviceId() {
		return deviceId;
	}
	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	/**
	 * @return the deviceName
	 */
	public String getDeviceName() {
		return deviceName;
	}
	/**
	 * @param deviceName the deviceName to set
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the screenSize
	 */
	public double getScreenSize() {
		return screenSize;
	}
	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ElectronicDevice [deviceId=" + deviceId + ", deviceName=" + deviceName + ", brand=" + brand
				+ ", screenSize=" + screenSize + ", price=" + price + "]";
	}
	
}
