package com.learning.fundamentals07;

public class ExampleCode {
    public static void main(String[] args) {

        // concept declaration variable in scope and out of scope in switch statement

        int value = 1;

        switch (value) {
            case 1:
//                i = 100; // out of scope this is error
                break;
            case 2:
                int i = 200; // declaration variable in scope switch statement
                break;
            default:
                i = 300; // -> this is ok
        }

//        System.out.println(i); -> got error because out of scope variable
    }
}
