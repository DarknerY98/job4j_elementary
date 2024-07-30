package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i) && i > 0) {
                counter += 1;
            } else if (symbol != input.charAt(i) && i > 0) {
                if (counter != 1) {
                    result = result + symbol + counter;
                } else {
                    result = result + symbol;
                }
                symbol = input.charAt(i);
                counter = 1;

            }
            if (i + 1 == input.length()) {
                if (counter != 1) {
                    result = result + symbol + counter;
                } else {
                    result = result + symbol;
                }
            }
        }
        return result;
    }
}