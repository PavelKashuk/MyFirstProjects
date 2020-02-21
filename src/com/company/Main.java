package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{-14, 23, 9, -4, 12, -1};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            // write your code here
        }
        System.out.println("Максимальный элемент: " + max);
    }
}
