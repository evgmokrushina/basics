package ru.jenia.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
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
