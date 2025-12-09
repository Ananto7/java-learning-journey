package com.learning.java.constructorChallenge;

public class MainConstructor {
    public static void main(String[] args) {
        ConstructorChallenge constructorChallenge = new ConstructorChallenge("Andri", 1000, "andripurwanto@gmail.com");

        System.out.println(constructorChallenge.getName());
        System.out.println(constructorChallenge.getCreditLimit());
        System.out.println(constructorChallenge.getEmail());
    }
}
