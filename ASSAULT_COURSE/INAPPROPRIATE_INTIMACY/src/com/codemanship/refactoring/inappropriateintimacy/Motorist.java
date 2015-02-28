package com.codemanship.refactoring.inappropriateintimacy;

public class Motorist
{
    private final String surname;
    private final String firstName;
    private final String title;

    public Motorist(String surname, String firstName, String title)
    {
        this.surname = surname;
        this.firstName = firstName;
        this.title = title;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getTitle()
    {
        return title;
    }

}
