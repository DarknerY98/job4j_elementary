package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int ostatoc = money - price;
        int size = 0;

        for (int coin : coins) {
                while (ostatoc >= coins[coin]) {
                    for (int y = size; y < rsl.length; size++) {
                        rsl[y] = coins[coin];
                        size = size + 1;
                        ostatoc = ostatoc - coins[coin];
                        break;
                    }
                }
            }
        return Arrays.copyOf(rsl, size);
    }
}