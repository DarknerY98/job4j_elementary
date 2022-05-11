package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println("число четное? " + isEven(9));
        System.out.println("число четное? " + isEven(8));
        System.out.println("число положительное? " + isPositive(18));
        System.out.println("число положительное? " + isPositive(-18));
        System.out.println("число число четное или не положительное? " + evenOrNotPositive(19));
        System.out.println("число нечетное и положительное? " + notEvenAndPositive(19));

    }

}

