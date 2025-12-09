package com.learning.java.java.fundamentals05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers2 = {0, 5, 6, 8, 9};
        System.out.println(Arrays.toString(numbers2));
        numbers2[1] = 55;
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);

        String[] names = {"Jamila", "Alex"};

        // cara merubah default value pada array
        int[] numbers3 = new int[3];
        Arrays.fill(numbers3, -1);
        System.out.println(Arrays.toString(numbers3));

        boolean[] bools = new boolean[3];
        System.out.println(Arrays.toString(bools));

        String[] names2 = new String[3];
        names2[1] = "Jamila";
        System.out.println(Arrays.toString(names2));
    }
}
