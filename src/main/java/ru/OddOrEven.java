package ru;

import java.util.function.Predicate;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        int res = 0;
        for(int i = 0; i <= array.length - 1; i++){
            res += array[i];
        }

        Predicate<Integer> predicate = x -> x % 2 == 0;
        if(predicate.test(res)){
            return "even";
        } else{
            return "odd";
        }
    }
}
