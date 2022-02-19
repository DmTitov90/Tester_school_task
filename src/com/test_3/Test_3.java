package com.test_3;

import java.util.*;

/**
 * Creator Dmitrii Titov
 * Date 19.02.2022 Version 1.0.0
 */
public class Test_3 {
    static int cyclCount = 5;
    static int count = 0;
    static int[] arr = new int[]{2, -1, 2, 0, 1};

    public static void main(String[] args) {
        //создаем Множество(Set) чтобы проверять дубликаты
        Set<Integer> set = new HashSet<>();
        //Создаем массив массивов в которую вносим линзу и рекомендуемый диапазон
        List<List<Integer>> list = new ArrayList<>();
        //Сортируем линзы
        Arrays.sort(arr);
        //Добавляем диапазоны допустимых линз для каждого циклопа
        for (int i : arr) {
            list.add(new ArrayList<>(Arrays.asList(i - 1, i, i + 1)));
        }
        for (List<Integer> integers : list) {
            //Проверяем соседние дубликаты диапазонов
            for (Integer integer : integers) {
                if (set.contains(integer)) {
                    //В случае дубликата, добавляем линзу для пары циклопов
                    count++;
                    //Сет мы обновляем чтобы отсечь проверенные пары
                    set.clear();
                    // Останавливаем цикл для перехода на следующего циклопа
                    break;
                } else {
                    set.add(integer);
                }
            }
        }
        // Проверка, если кол-во циклопов не четное, тогда добавляем еще одну пару линз
        if (count * 2 == cyclCount - 1) {
            System.out.println(++count);
        } else {
            System.out.println(count);
        }
    }
}