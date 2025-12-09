package com.learning.java.constructorChallenge;

public class ConstructorChallenge {

    private String name;
    private double creditLimit;
    private String email;

    public ConstructorChallenge(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public ConstructorChallenge() {
        this("Andri", 20.5, "andripurwanto540@gmail.com");
    }

    public ConstructorChallenge(String name, String email) {
        this(name, 22.5, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
