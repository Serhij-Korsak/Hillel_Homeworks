package com.hillel.lessons.lesson9;

public class LessonNine {
    public static void main(String[] args) throws InterruptedException {
        String[][] array = new String[10][10];
        makeSquare(array);
        printArray(array);
        Thread.sleep(500);
        fillMainWithPluses(array);
        printArray(array);
        Thread.sleep(500);

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                fillLeftQuarter(array);
                printArray(array);
                System.out.println();
                Thread.sleep(500);
            }
            if (i == 1) {
                clearArray(array);
                fillUpperQuarter(array);
                printArray(array);
                Thread.sleep(500);
            }
            if (i == 2) {
                clearArray(array);
                fillRightQuarter(array);
                printArray(array);
                Thread.sleep(500);
            }
            if (i == 3) {
                clearArray(array);
                fillLowerQuarter(array);
                printArray(array);
                Thread.sleep(500);
            }
            if (i == 4) {
                clearArray(array);
            }
        }
    }

    public static void makeSquare(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ".";
            }
        }
    }

    public static void fillMainWithPluses(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j] = "+";
                }
                if ((i + j) == (a.length - 1)) {
                    a[i][j] = "+";
                }
            }
        }
    }

    public static void clearArray(String[][] a) throws InterruptedException {
        makeSquare(a);
        fillMainWithPluses(a);
        printArray(a);
    }

    public static void printArray(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillLeftQuarter(String[][] a) {
        for (int i = 0; i < (a.length); i++) {
            for (int j = 0; j < (a.length); j++) {
                if ((i > j) && ((i + j) <= (a.length)))
                    a[i][j] = "+";
            }
        }
    }

    public static void fillUpperQuarter(String[][] a) {
        for (int i = 0; i < (a.length); i++) {
            for (int j = 0; j < (a.length); j++) {
                if ((i < j) && ((i + j) <= (a.length)))
                    a[i][j] = "+";
            }
        }
    }

    public static void fillRightQuarter(String[][] a) {
        for (int i = 0; i < (a.length); i++) {
            for (int j = 0; j < (a.length); j++) {
                if ((i < j) && ((i + j) >= (a.length)))
                    a[i][j] = "+";
            }
        }
    }

    public static void fillLowerQuarter(String[][] a) {
        for (int i = 0; i < (a.length); i++) {
            for (int j = 0; j < (a.length); j++) {
                if ((i > j) && ((i + j) >= (a.length)))
                    a[i][j] = "+";
            }
        }
    }

}