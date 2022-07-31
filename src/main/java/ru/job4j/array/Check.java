package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
               for (int i = 0; i < data.length; i++) {
                   boolean a = data[0];
                   if (data[i] != a) {
                       result = false;
                       break;
                   }
                }
        return result;
    }
}