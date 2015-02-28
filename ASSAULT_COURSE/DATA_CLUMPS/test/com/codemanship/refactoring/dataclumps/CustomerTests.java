package com.codemanship.refactoring.dataclumps;

import static org.junit.Assert.*;

import org.junit.Test;


public class CustomerTests {

	@Test
	public void customerAddressSummaryIncludesHouseStreetCityPostCodeAndCountry() throws Exception {
		Customer customer = new Customer();
		Address address = new Address("43", "Rankin Road", "London", "United Kingdom", "SW23 9YY");
		customer.setAddress(address);

		String addressSummary = customer.getAddressSummary();
		
		assertEquals("43, Rankin Road, London, SW23 9YY, United Kingdom", addressSummary);
	}
}
