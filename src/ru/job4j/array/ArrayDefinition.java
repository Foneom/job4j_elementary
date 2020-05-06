package ru.job4j.array;

import java.lang.reflect.Array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Sidr Sidorov";
        names[3] = "Goga Vartanov";
        System.out.printf("Names: %n%s;%n%s;%n%s;%n%s.", names[0], names[1], names[2], names[3]);
    }
}
