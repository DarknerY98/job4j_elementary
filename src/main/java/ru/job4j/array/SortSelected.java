package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
        return data;
    }
}

