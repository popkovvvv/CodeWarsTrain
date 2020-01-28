package ru;

import java.util.Arrays;

public class MaxProduct {
    public static long maxProduct(int[] numbers, int sub_size)
    {

        Arrays.sort(numbers );
        int res = 0;
        for(int i = 0; i < sub_size; i++){

            res+=numbers[i];

        }
        return res; // Do your magic!
    }
}
