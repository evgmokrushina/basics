package ru.jenia.calculator;

public class Arguments {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Jenia";
        int age = 6;
        Arguments.hello(name, age);
        Arguments.hello(name, age);
        Arguments.hello(name, age);
        Arguments.hello(name, age);
    }
}
