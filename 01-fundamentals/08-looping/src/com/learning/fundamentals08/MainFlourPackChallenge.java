package com.learning.fundamentals08;

public class MainFlourPackChallenge {
    public static void main(String[] args) {
        System.out.println("canPack = " + canPack(1, 4, 9));
        System.out.println("canPack = " + canPack(1, 0, 5));
        System.out.println("canPack = " + canPack(0, 5, 4));
        System.out.println("canPack = " + canPack(2, 2, 11));
        System.out.println("canPack = " + canPack(-3, 2, 12));
        System.out.println("canPack = " + canPack(0, 5, 5));
        System.out.println("canPack = " + canPack(2, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // 1 big count -> 5 kilos each
        // 1 small count -> 1 kilos each
        // the goal is make equal of big count and small count must be at least to the value of goal and return true.
        // if big count = 2 (2*%) bigger than goal return false
        // if any of the parameters are negative, return false

        return goal >= 0 && bigCount * 5 + smallCount >= goal && goal % 5 <= smallCount;
    }
}
