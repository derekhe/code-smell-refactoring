package com.codemanship.refactoring.dataclumps;

public class Customer {

	private String firstName;
	private String lastName;
	private String title;
	private Address address = new Address();

	
	public void setAddress(Address address)
	{
		this.address = address;
	}

	public String getAddressSummary(){
		return address.getHouse() + ", " + address.getStreet() + ", " + address.getCity() + ", " +
				address.getPostcode() + ", " + address.getCountry();
	}
}
