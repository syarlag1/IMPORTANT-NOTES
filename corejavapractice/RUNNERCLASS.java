package corejavapractice;

import java.util.ArrayList;

public class RUNNERCLASS {

    public static void main(String[] args) {
        int[] numbers = {3, 6, 5, 10,2};
        String s="sai";
        for (int i = 0; i <5; i++) {
            int n = numbers[0];
            // If condition to check even or odd
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
            if (n > 8) {
                System.out.println(n + " is greater than 8");
            }
            // Breaking loop if a number is 20
            if (n == 20) {
                System.out.println("Found 20, stopping loop!");
                break;
            }
        }
    }
}


