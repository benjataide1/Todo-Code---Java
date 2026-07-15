package com.tp.thymeleaf_demo.model;


public class Persona {

    private String name;
    private String lastname;
    private int age;

    public Persona() {
    }

    public Persona(int age, String lastname, String name) {
        this.age = age;
        this.lastname = lastname;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
