package ru.jenia.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), third, fourth);
    }

    public static void main(String[] args) {
        int maxNumber = Max.max(1, 3);
        System.out.println(maxNumber);
        maxNumber = Max.max(5, 2);
        System.out.println(maxNumber);
        maxNumber = Max.max(6, 6);
        System.out.println(maxNumber);
    }
}
