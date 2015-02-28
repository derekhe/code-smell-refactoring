package com.codemanship.refactoring.dataclumps;

public class Address
{
    String street;
    String city;
    String postcode;
    private String house;
    String country;

    public Address()
    {
    }

    public Address(String house, String street, String city, String country, String postcode)
    {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.house = house;
        this.country = country;
    }

    public String getHouse()
    {
        return house;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}