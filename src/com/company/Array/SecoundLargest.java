package com.company.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecoundLargest {
    public static void main(String[] args) {

        Integer[] numbers = {10, 50, -2 , 200, 5, 32};
        List<Integer> list=Arrays.asList(numbers);
        Collections.sort(list);
        System.out.println(list.get(numbers.length - 2));

    }
}
