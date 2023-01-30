package ru.jenia.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rs1 = value / 70;
        return rs1;

    }

    public static float rubleToDollar(float value) {
        float rs1 = value / 60;
        return rs1;

    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result: " + passed);

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar");

        float out1 = Converter.rubleToDollar(in);
        boolean passed1 = expected == out1;
        System.out.println("140 rubles are 2 dollar. Test result: " + passed1);
    }

}
