package ru;

import java.util.Arrays;
import java.util.Collections;

import static ru.Arge.nbYear;
import static ru.MaxProduct.maxProduct;
import static ru.OddOrEven.oddOrEven;
import static ru.TidyNumber.tidyNumber;

public class App {
    public static void main(String[] args) {
        System.err.println(oddOrEven(new int[] {2, 5, 34, 7}));
        System.err.println(nbYear(1500, 5, 100, 5000));
        System.err.println(tidyNumber(1237689));
        System.err.println(maxProduct(new int[]{4,3,5}, 2));
    }


}
