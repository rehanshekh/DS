package com.blz;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryWordSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] array = {"bridge", "labz", "testing", "ide"};
        Arrays.sort(array);
        System.out.println("Enter the input");
        String x = in.next();
        int result = binarySearch(array, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + "index " + result);
        }
    }

    private static int binarySearch(String[] array, String x) {
        int i = 0;
        int r = array.length - 1;
        while (i <= r) {
            int m = 1 + (r - 1) / 2;
            int res = x.compareTo(array[m]);
            if (res == 0) {
                return m;
            }
            if (res > 0) {
                i = m + 1;
            } else {
                r = m - 1;
            }

        }
        return -1;
    }
}
