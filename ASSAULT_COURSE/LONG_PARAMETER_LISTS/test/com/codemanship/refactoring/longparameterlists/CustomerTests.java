package com.codemanship.refactoring.longparameterlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTests {

	@Test
	public void customerSummaryIncludesFullNameWithTitleAndCityPostCodeAndCountry() throws Exception {
		Customer customer = new Customer("Mr",  "Jason", "Gorman");
		Address address = new Address("London", "SW23 9YY", "United Kingdom");
		customer.setAddress(address);
		
		assertEquals("Mr Jason Gorman, London, SW23 9YY, United Kingdom", customer.getSummary());
	}
}
