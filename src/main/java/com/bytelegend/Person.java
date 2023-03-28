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

    @Override
    public int hashCode() {
        int result =17;
        result =31 * result + firstName.hashCode();
        result =31 * result + lastName.hashCode();
        return result;
    }
}
