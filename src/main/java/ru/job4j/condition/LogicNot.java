package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) { //    isEven() - проверяет, что число четное;
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) { //        2. isPositive() -  проверяет, что число положительное.
        return num > 0;
    }

    public static boolean notEven(int num) { //        - метод notEven(), проверяет, что число нечетное;
        return !isEven(num);
    }

    public static boolean notPositive(int num) { //        - метод notPositive(), проверяет, что число не положительное;
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) { //- метод notEvenAndPositive(), проверяет, что число нечетное и положительное;
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) { //        - метод evenOrNotPositive(), проверяет, что число четное или не положительное.
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

//

//
//        Вам необходимо дописать код в остальные методы и при этом использовать уже реализованные методы в:
//

//

//
//        а также сочетания реализованных методов в указанных ниже методах:
//
//
//
