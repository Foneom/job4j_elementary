package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i <= table.length; i++) {
            for (int j = 1; j <= table.length; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        return table;
    }

    public static void main(String[] args) {
        multiple(2);
    }
}
