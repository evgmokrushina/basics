package ru.jenia.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        if (number > 1) {
            prime = true;
        }
        for (int i = 2; i <= (number - 1); i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
