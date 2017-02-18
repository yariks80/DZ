package com.company;

import java.util.Arrays;

public class Main {
    static int[][] a = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(a));
        for (int i = 1; i < a.length; i++) {
            int temp = a[0][i];
            a[0][i] = a[i][i];
            a[i][i] = temp;
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println("dhdh");
        System.out.println("aaaaaa");
        System.out.println("ssssss");
    }
}
