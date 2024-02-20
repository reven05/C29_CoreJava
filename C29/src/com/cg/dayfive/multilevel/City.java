package com.cg.dayfive.multilevel;

public class City extends State {
	private String cityName;
	private int pinCode;
	//state, country
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPinCode() {
		return pinCode;
	}
	//@Override
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", pinCode=" + pinCode + ", getStateName()=" + getStateName()
				+ ", getCountryName()=" + getCountryName() + ", getCapital()=" + getCapital() + "]";
	}
	
	

}
