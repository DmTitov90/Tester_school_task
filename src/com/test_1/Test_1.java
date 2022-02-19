package com.test_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Creator Dmitrii Titov
 * Date 18.02.2022 Version 1.0.0
 */

public class Test_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Данная программа считает сумму простых чисел, которые не превышают ваше число." + "\n");
        System.out.print("Введите число: ");
        Number number = new Number(reader.readLine());
        number.start();
    }
}
