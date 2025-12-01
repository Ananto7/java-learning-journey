package com.learning.fundamentals03;

public class Challenge {
    public static void main(String[] args) {

        displayHighScorePosition("de amazing", calculateHighScorePosition(1500));
        displayHighScorePosition("de best", calculateHighScorePosition(1000));
        displayHighScorePosition("de good", calculateHighScorePosition(500));
        displayHighScorePosition("de ok", calculateHighScorePosition(100));
        displayHighScorePosition("de lama", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get position " + position + " on the highScore list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
