package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            int y = i + 1;
            for (int j = 0; j <  size; j++) {
                table[i][j] = y * (j + 1);

            }
        }
        return table;
    }

}
