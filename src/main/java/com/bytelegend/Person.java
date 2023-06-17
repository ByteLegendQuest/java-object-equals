package com.bytelegend;

import java.util.Objects;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return Objects.equals(firstName, ((Person) obj).firstName) && Objects.equals(lastName, ((Person) obj).lastName);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
