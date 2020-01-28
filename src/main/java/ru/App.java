package ru;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static ru.Arge.nbYear;
import static ru.Disarium.disariumNumber;
import static ru.OddOrEven.oddOrEven;
import static ru.StreamApi.train;

public class App {
    public static void main(String[] args) {
        System.err.println(oddOrEven(new int[] {2, 5, 34, 7}));
//        System.err.println(nbYear(1500, 5, 100, 5000));
//        System.err.println(disariumNumber(89));
//        System.err.println(digital_root(16));
//
        train();
    }


    public static int digital_root(int n) {
        String temp = Integer.toString(n);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        int res = 0;
        for(int i = 0; i <= newGuess.length; i++){

            if(newGuess.length > 1){
                return digital_root(res);
            }
        }

        return res;

    }



}
