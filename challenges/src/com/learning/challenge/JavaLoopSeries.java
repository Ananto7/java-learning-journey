package com.learning.challenge;

import java.util.Scanner;

public class JavaLoopSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++ ) {
                sum += (int) (b * Math.pow(2, j));
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
