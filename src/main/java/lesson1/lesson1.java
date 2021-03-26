package lesson1;

public class lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign ();
        printColor();
        compareNumbers();
    }

    //todo Задание 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //todo Задание 3
    public static void checkSumSign () {
        int a = 1;
        int b = 2;

        String resultSumm = (a + b >=0) ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(resultSumm);

    }

    //todo Задание 4
    public static void printColor() {
        int value = 1;

        if (value <=0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зелёный");
        }
    }

    //todo Задание 5
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        String resultComparison = (a >= b) ? "a >= b": "a < b";
        System.out.println(resultComparison);
    }
}
