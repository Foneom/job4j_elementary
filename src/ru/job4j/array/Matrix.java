package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table.length; j++) {
                table[i][j] = i * j;
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        return table;
    }
}
