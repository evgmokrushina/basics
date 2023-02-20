package ru.jenia.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        if (result <= 1) {
            result++;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }
}
