package com.blz;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = new String[4];
        for (int i = 0; i < 4; i++) {
            int input = i + 1;
            System.out.println("Enter the " + input + " input");
            words[i] = in.next();
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                int differ = words[j].compareTo(words[i]);
                if (differ < 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
