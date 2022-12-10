package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (!name.isEmpty() && !isDigit(name.codePointAt(0))  && !isLowerLatinLetter(name.codePointAt(0)) && !isDigit(name.codePointAt(0))) {
                        for (int i = 1; i < name.length(); i++) {
                            int code = name.codePointAt(i);
                            if (!isSpecialSymbol(code) || !isUpperLatinLetter(code) || !isLowerLatinLetter(code) || name.isEmpty()) {
                                valid = false;
                                break;
                            }
                        }
        } else if (name.isEmpty() || isDigit(name.codePointAt(0))) {
            valid = false;

        }
        return valid;
    }

        public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 90;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean valid = false;
        if (code >= 65 && code <= 90) {
            valid = true;
        }
        return valid;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean valid = false;
        if (code >= 97  && code <= 122) {
            valid = true;
        }
        return valid;

    }

    public static void main(String[] args) {
       System.out.println(isNameValid("first"));
    }
}