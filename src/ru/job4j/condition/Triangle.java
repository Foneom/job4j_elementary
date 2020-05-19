package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ab, Point ac, Point bc) {
        this.first = ab;
        this.second = ac;
        this.third = bc;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        if (this.exist(a, b, c)) {
            rsl = TrqArea.square(a, b, c);
            }
        return rsl;
        }

    public static boolean exist(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
