package lesson3;

import java.util.Arrays;

public class Homework3 {

    // todo Задача 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    //  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;


    static int[] getArrayReplace(int[] replace) {
        for (int i = 0; i < replace.length; i++) {
            if (replace[i] == 0) {
                replace[i] = 1;
                System.out.print(replace[i]);
            } else if (replace[i] == 1) {
                replace[i] = 0;
                System.out.print(replace[i]);
            } else {
                System.out.println(" Значения массива должны содержать только 0 или 1 ");
            }
        }
        return replace;
    }


    // todo Задача 2. Задать пустой целочисленный массив длиной 100.
    //  С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    static int[] getArrayFill(int[] fill) {
        for (int i = 0; i < fill.length; i++) {
            fill[i] = i;
            System.out.print(fill[i]);
        }
        return fill;
    }

    // todo Задача 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    //  пройти по нему циклом, и числа меньшие 6 умножить на 2;

    static int[] getArrayMultiply(int[] multiply) {
        for (int i = 0; i < multiply.length; i++) {
            if (multiply[i] < 6) {
                multiply[i] *= 2;
            }
            System.out.print(multiply[i]);
        }
        return multiply;
    }

// todo Задача 4.  Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с
//  помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//  Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
//  [0][0], [1][1], [2][2], …, [n][n];

    static void fillMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            m[i][i] = m[i][m.length - i - 1] = 1;
        }
    }

// todo Задача 5.Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
//  массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static void foo(int len, int initValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initValue;
            System.out.print(arr[i]);
        }
    }

// todo Задача 6. Задать одномерный массив и найти в нем минимальный и максимальный элементы;

    static void printStats(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }
        System.out.println(min);
        System.out.println(max);
    }

// todo Задача 7. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
//  true, если в массиве есть место, в котором сумма левой и правой части массива равны;


    static boolean hasBalance(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int leftSum = 0;
        for (int i = 0; i < a.length; i++) {
            leftSum += a[i];
            if (leftSum * 2 == sum) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.print(" | ");
                for (int j = i + 1; j < a.length; j++) {
                    System.out.print(a[j] + " ");
                }
                return true;
            }
        }
        return false;
    }
// todo Задача 8.Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//  или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
//  Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//  Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
//  при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами

    public static void shift(int[] array, int n) {
        int len = array.length;
        n = (len + n % len) % len;
        for (int i = 0; i < n; i++) {
            int first = array[0];
            for (int j = 0; j < len - 1; j++) {
                array[j] = array[j + 1];
            }
            array[len - 1] = first;
        }
    }


    public static void main(String[] args) {
        // todo Задача 1.
        getArrayReplace(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        System.out.println(" ");
        // todo Задача 2.
        getArrayFill(new int[101]);
        System.out.println(" ");
        // todo Задача 3.
        getArrayMultiply(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        // todo Задача 4.
        int[][] m = new int[5][5];
        fillMatrix(m);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        // todo Задача 5.
        foo(10, 2);
        System.out.println();
        // todo Задача 6.
        printStats(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 100});
        // todo Задача 7.
        System.out.println(hasBalance(new int[]{1, 3, 4, 5, 6, 8, 9, 1, 1}));
        // todo Задача 8.
        for (int i = -5; i < 6; i++) {
            int[] a = new int[]{1, 2, 3, 4, 5};
            shift(a, i);
            System.out.println(Arrays.toString(a));
        }
    }
}