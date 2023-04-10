package ru.jenia.checkstyle;

public class Broken {
    String name;
    String surname;
    private int sizeOfEmpty = 10;
    public static final String NEW_VALUE = "";

    public Broken() { }

    public void echo() { }

    public void method(int a, int b, int c, int d, int e, int f, int g) { }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}
