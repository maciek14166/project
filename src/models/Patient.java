package models;

import interfaces.Person;

public class Patient implements Person {
    private final String name;
    private final int age;
    private final Disease disease;

    public Patient(String name, int age, Disease disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Disease getDisease() {
        return disease;
    }

    @Override
    public void speak() {
        System.out.printf("Hello, I'm %s, I'm %d years old and I have a %s\n", name, age, disease.name().toLowerCase());
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", disease=" + disease +
                '}';
    }
}
