package ru.jenia.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double duty = amount * (percent / 100);
            double repayment = duty - salary;
            amount += repayment;
            year++;
        }
        return year;
    }
}
