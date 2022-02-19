package com.test_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Creator Dmitrii Titov
 * Date 18.02.2022 Version 1.0.0
 */
public class Test_2 {
    static int change;
    static int fiveThousand = 0;
    static int twoThousand = 0;
    static int oneThousand = 0;
    static int fiveHundred = 0;
    static int twoHundred = 0;
    static int oneHundred = 0;
    static int fifty = 0;
    static int ten = 0;
    static int five = 0;
    static int two = 0;
    static int one = 0;
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Сумма заказа
        System.out.print("Введите стоимость покупки: ");
        int price = Integer.parseInt(reader.readLine());
        // Внесенная сумма
        System.out.print("\n" + "Введите внесенную сумму: ");
        int cash = Integer.parseInt(reader.readLine());
        change = cash - price;
        changeMethod(change);

        //Вывод через запятую элементов
        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                resultStr.append(result.get(i));
            } else {
                resultStr.append(result.get(i));
                resultStr.append(", ");
            }
        }
        //Вывод сдачи
        System.out.println(resultStr);
    }

    // Метод для рассчета колличества купюр
    public static void changeMethod(int leftChange) {
        while (leftChange > 0) {
            if (leftChange / 5000 > 0) {
                fiveThousand = leftChange / 5000;
                leftChange %= 5000;
                if (fiveThousand > 0) {
                    result.add("5000 руб: " + fiveThousand + " шт.");
                }
            } else if (leftChange / 2000 > 0) {
                twoThousand = leftChange / 2000;
                leftChange %= 2000;
                if (twoThousand > 0) {
                    result.add("2000 руб: " + twoThousand + " шт.");
                }
            } else if (leftChange / 1000 > 0) {
                oneThousand = leftChange / 1000;
                leftChange %= 1000;
                if (oneThousand > 0) {
                    result.add("1000 руб: " + oneThousand + " шт.");
                }
            } else if (leftChange / 500 > 0) {
                fiveHundred = leftChange / 500;
                leftChange %= 500;
                if (fiveHundred > 0) {
                    result.add("500 руб: " + fiveHundred + " шт.");
                }
            } else if (leftChange / 200 > 0) {
                twoHundred = leftChange / 200;
                leftChange %= 200;
                if (twoHundred > 0) {
                    result.add("200 руб: " + twoHundred + " шт.");
                }
            } else if (leftChange / 100 > 0) {
                oneHundred = leftChange / 100;
                leftChange %= 100;
                if (oneHundred > 0) {
                    result.add("100 руб: " + oneHundred + " шт.");
                }
            } else if (leftChange / 50 > 0) {
                fifty = leftChange / 50;
                leftChange %= 50;
                if (fifty > 0) {
                    result.add("50 руб: " + fifty + " шт.");
                }
            } else if (leftChange / 10 > 0) {
                ten = leftChange / 10;
                leftChange %= 10;
                if (ten > 0) {
                    result.add("10 руб: " + ten + " шт.");
                }
            } else if (leftChange / 5 > 0) {
                five = leftChange / 5;
                leftChange %= 5;
                if (five > 0) {
                    result.add("5 руб: " + five + " шт.");
                }
            } else if (leftChange / 2 > 0) {
                two = leftChange / 2;
                leftChange %= 2;
                if (two > 0) {
                    result.add("2 руб: " + two + " шт.");
                }
            } else {
                one = leftChange;
                leftChange %= 1;
                result.add("1 руб: " + one + " шт.");
            }
        }
    }
}


