package org.example.hw2;

import java.time.LocalDate;
import java.time.Year;


public class Human {
    private final int age;
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final int weight;


    public Human(String firstName, String lastName, LocalDate birthDate, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;

        age = Year.now().getValue() - birthDate.getYear();
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  "\n" + "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }
}
