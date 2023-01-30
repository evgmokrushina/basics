package ru.jenia.calculator;

import static ru.jenia.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double deltaAndDiv(double first, double second) {
        return delta(first, second)
                + div(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + delta(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления равна: " + deltaAndDiv(10, 20));
        System.out.println("Сумма всех операций равна: " + sumAll(10, 20));
    }
}
