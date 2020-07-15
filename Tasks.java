package ru.geekbrains.lesson1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a1 = 120;
        short b1 = -30000;
        int c1 = 405245;
        long d1 = 9223372036854L;
        float e1 = 71.278f;
        double g1 = 3.14159;
        char letter = 1067;
        boolean answer = false;
        String name = "Олег";

        int a = 2;
        int b = 1;
        int c = 4;
        int d = 2;
        int p = -10;

        System.out.println(countExpression(a,b,c,d));

        System.out.println(checkSumm(c,d));

        checkValue(d);

        System.out.println(checkIfNegative(p));

        showName(name);

        System.out.println("Введите год!");
        int year = scanner.nextInt();
        checkYear(year);

    }
    static int countExpression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean checkSumm(int c, int d) {
        if ( ((c + d) >= 10) && ((c + d) <= 20)){
            return true;
        }
        return false;
    }
    static void checkValue (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }
        System.out.println("Число отрицательное");
    }
    static boolean checkIfNegative(int p) {
        if (p < 0) return true;
        return false;
    }


    static void showName(String name) {
        System.out.println("Привет," + " " + name);
    }
    static void checkYear(int year) {
        if (!(year % 100 == 0) && (year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " " + "год високосный!");
        }
        else System.out.println(year + " " + "год не является високосным!");
    }
}
