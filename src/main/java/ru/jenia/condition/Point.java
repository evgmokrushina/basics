package ru.jenia.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double addition = Math.pow(deltaX, 2) + Math.pow(deltaY, 2);
        double rsl = Math.sqrt(addition);
        return rsl;

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("Result (0,0) to (2,0) " + result);
    }
}
