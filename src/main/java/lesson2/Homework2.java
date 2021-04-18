package lesson2;

public class Homework2 {
    // todo Задание 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    //  в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static void getSummAB (int a, int b) {
        boolean resultSummAB = (a + b >= 10 && a + b <= 20) ? true : false;
        System.out.println(resultSummAB);
    };
    // todo ------------------------------------------------------------------------------------------------------


    // todo Задание 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    //  в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void getPrintPosOrNeg (int a) {
        String resultPosOrNeg = (a >= 0) ? "Число положительное": "Число отрицательное";
        System.out.println(resultPosOrNeg);
    }
    // todo ------------------------------------------------------------------------------------------------------


    // todo Задание 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть
    //  true, если число отрицательное, и вернуть false если положительное

    public static void getPrintPosOrNeg2 (int a) {
        boolean resultPosOrNeg = (a < 0) ? true : false;
        System.out.println(resultPosOrNeg);
    }
    // todo ------------------------------------------------------------------------------------------------------



    // todo Задание 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
    //  отпечатать в консоль указанную строку, указанное количество раз;

    static void printTextNTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    // todo ------------------------------------------------------------------------------------------------------




    public static void main(String[] args) {
        getSummAB(11, 2); // todo Задание 1.
        getPrintPosOrNeg (-1); // todo Задание 2.
        getPrintPosOrNeg2 (1); // todo Задание 3.
        printTextNTimes("Hello", 5); // todo Задание 4.
    }
}
