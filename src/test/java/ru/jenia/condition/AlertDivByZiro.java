package ru.jenia.condition;

public class AlertDivByZiro {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
            }
        if (number < 0) {
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivByZiro.possibleDiv(4);
        AlertDivByZiro.possibleDiv(0);
        AlertDivByZiro.possibleDiv(-4);
    }
}
