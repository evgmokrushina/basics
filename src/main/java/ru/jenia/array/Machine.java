package ru.jenia.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int changeOfMoney = money - price;
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int coin : coins) {
            while (changeOfMoney >= coin) {
                changeOfMoney -= coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
