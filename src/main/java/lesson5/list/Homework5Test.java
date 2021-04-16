package lesson5.list;

import lesson5.Homework5;

import java.util.Arrays;

public class Homework5Test<employees> {
    public static void main(String[] args) {
        Homework5[] employees = new Homework5[5];

        employees[0] = new Homework5(
                "Ivanov Ivan",
                "developer",
                "88801234567@gmail.com",
                "8880123456",
                30,
                350000);

        employees[1] = new Homework5(
                "Petrov Petr",
                "QA engineer",
                "88801234567@gmail.com",
                "8880123456",
                21,
                60000);

        employees[2] = new Homework5(
                "Sidorov Oleg",
                "developer",
                "88801234567@gmail.com",
                "8880123456",
                33,
                100000);

        employees[3] = new Homework5(
                "Alekseeva Natalia",
                "Senior QA engineer",
                "88801234567@gmail.com",
                "8880123456",
                36,
                210000);

        employees[4] = new Homework5(
                "Popova Vika",
                "director",
                "8880000000@gmail.com",
                "8880000000",
                95,
                10000000
        );
        for (Homework5 homework5 : employees) {
            if (homework5.getAge() > 40) ;
            homework5.printInfo();
        }

    }
}
