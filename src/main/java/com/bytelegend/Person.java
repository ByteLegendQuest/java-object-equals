package com.bytelegend;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object otherPerson) {
        if (!(otherPerson instanceof Person)) {
            return false;
        }

        Person other = (Person) otherPerson;
        return other.firstName.equals(firstName) && other.lastName.equals(lastName);
    }
}
