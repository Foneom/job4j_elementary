package ru.job4j.condition;

public class TrqArea {

    public static double square(double a, double b, double c) {
        double halfP = (a + b + c) / 2;
        double rsl = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        return rsl;
    }
    public static void main(String[] args) {
        double result1 = TrqArea.square(2, 2, 2);
        System.out.printf("Площадь треугольника: %.2f",result1);
    }
}

