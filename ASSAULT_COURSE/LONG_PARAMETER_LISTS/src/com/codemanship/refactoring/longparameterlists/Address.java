package com.codemanship.refactoring.longparameterlists;

public class Address {
	
	private String city;
	private String postcode;
	private String country;

	public Address(String city, String postcode, String country)
	{
		this.city = city;
		this.postcode = postcode;
		this.country = country;
	}

	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getPostcode() {
		return postcode;
	}
}
