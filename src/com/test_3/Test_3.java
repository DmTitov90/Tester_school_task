package com.test_3;

import java.util.*;

public class Test_3 {

    static int count = 0;
    static int cyclCount = 5;
    static int[] arr = new int[]{1, -1, 2, 3, -3};


    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i : arr) {
            list.add(Arrays.asList(i-1, i, i+1));
        }

        for (List<Integer> integers : list) {
            for (Integer integer : integers) {
                if (!set.contains(integer)){
                    set.add(integer);
                } else {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
