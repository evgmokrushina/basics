package ru.jenia.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            rsl = number % 2 == 0 ? "The number divides by 6."
                    : "The number divides by 3, but it isn't the even number.";
        } else {
            rsl = number % 2 == 0 ? "The number doesn't divide by 3, but it is the even number."
                    : "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }
}
