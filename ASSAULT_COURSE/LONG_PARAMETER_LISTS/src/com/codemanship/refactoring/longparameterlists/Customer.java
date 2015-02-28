package com.codemanship.refactoring.longparameterlists;

public class Customer
{

    private String firstName;
    private String lastName;
    private String title;
    private Address address;

    public Customer(String title, String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getTitle()
    {
        return title;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public String getSummary()
    {
        return getTitle() + " " + getFirstName() + " " + getLastName() + ", " +
                address.getCity() + ", " + address.getPostcode() + ", " + address.getCountry();
    }

}
