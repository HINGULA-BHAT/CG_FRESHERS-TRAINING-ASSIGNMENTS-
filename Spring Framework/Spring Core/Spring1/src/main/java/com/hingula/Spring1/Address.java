package com.hingula.Spring1;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public void displayAddress() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Customer Address is :");
		System.out.println("---------------------");
		System.out.println(getStreet() + " " +getCity()+ " "+getState()+" "+getZip()+" "+getCountry());
		
	}

	
	
	


}
