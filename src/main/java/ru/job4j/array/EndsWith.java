package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int j = 0;
        for (int i = word.length - post.length; i < word.length; i++) {
                if (word[i] == post[j]) {
                    result = true;
                    j++;
                }
            }
        return result;
    }
}