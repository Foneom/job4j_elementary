package ru.job4j.condition;


public class Point {

        private int x;
        private int y;

        public Point(int first, int second) {
            this.x = first;
            this.y = second;
        }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((this.x - this.y), 2) + Math.pow((this.y - this.x), 2));
    }
}
