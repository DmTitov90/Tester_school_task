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
        System.out.print("Ваша сдача : ");
        method(change);


        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                resultStr.append(result.get(i));
            } else {
                resultStr.append(result.get(i));
                resultStr.append(", ");
            }
        }

        System.out.println(resultStr);
    }

    public static void method(int x) {
        while (x > 0) {
            if (x / 5000 > 0) {
                fiveThousand = x / 5000;
                x %= 5000;
                if (fiveThousand > 0) {
                    result.add("5000 руб: " + fiveThousand + " шт.");
                }
            } else if (x / 2000 > 0) {
                twoThousand = x / 2000;
                x %= 2000;
                if (twoThousand > 0) {
                    result.add("2000 руб: " + twoThousand + " шт.");
                }
            } else if (x / 1000 > 0) {
                oneThousand = x / 1000;
                x %= 1000;
                if (oneThousand > 0) {
                    result.add("1000 руб: " + oneThousand + " шт.");
                }
            } else if (x / 500 > 0) {
                fiveHundred = x / 500;
                x %= 500;
                if (fiveHundred > 0) {
                    result.add("500 руб: " + fiveHundred + " шт.");
                }
            } else if (x / 200 > 0) {
                twoHundred = x / 200;
                x %= 200;
                if (twoHundred > 0) {
                    result.add("200 руб: " + twoHundred + " шт.");
                }
            } else if (x / 100 > 0) {
                oneHundred = x / 100;
                x %= 100;
                if (oneHundred > 0) {
                    result.add("100 руб: " + oneHundred + " шт.");
                }
            } else if (x / 50 > 0) {
                fifty = x / 50;
                x %= 50;
                if (fifty > 0) {
                    result.add("50 руб: " + fifty + " шт.");
                }
            } else if (x / 10 > 0) {
                ten = x / 10;
                x %= 10;
                if (ten > 0) {
                    result.add("10 руб: " + ten + " шт.");
                }
            } else if (x / 5 > 0) {
                five = x / 5;
                x %= 5;
                if (five > 0) {
                    result.add("5 руб: " + five + " шт.");
                }
            } else if (x / 2 > 0) {
                two = x / 2;
                x %= 2;
                if (two > 0) {
                    result.add("2 руб: " + two + " шт.");
                }
            } else {
                one = x;
                x %= 1;
                result.add("1 руб: " + one + " шт.");
            }
        }
    }
}


