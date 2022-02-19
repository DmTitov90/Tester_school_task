package com.test_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Creator Dmitrii Titov
 * Date 19.02.2022 Version 1.0.0
 */
public class Test_3 {
    static int count = 0;
    static int[] arr = new int[]{2, -1, 2, 0, 1, 3};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число циклопов: ");
        int cyclCount = Integer.parseInt(reader.readLine());
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i : arr) {
            list.add(new ArrayList<>(Arrays.asList(i - 1, i, i + 1)));
        }
        for (List<Integer> integers : list) {
            for (Integer integer : integers) {
                if (set.contains(integer)) {
                    count++;
                    set.clear();
                    break;
                } else {
                    set.add(integer);
                }
            }
        }
        if (count * 2 == cyclCount - 1) {
            System.out.println(count);
        } else {
            System.out.println(count++);
        }
    }
}