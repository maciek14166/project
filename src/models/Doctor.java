package models;

import interfaces.Person;

public class Doctor implements Person {
    private final String name;
    private final int age;
    private final Specialization specialization;

    public Doctor(String name, int age, Specialization specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    @Override
    public void speak() {
        System.out.printf("Hello, I'm dr. %s, I'm %d years old and I specialize in %s", name, age, specialization.name().toLowerCase());
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialization=" + specialization +
                '}';
    }
}
