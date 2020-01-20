package ru;

public class App {
    public static void main(String[] args) {
        System.err.println(oddOrEven(new int[] {2, 5, 34, 7}));
    }

    public static String oddOrEven (int[] array) {
        int res = 0;
        for(int i = 0; i <= array.length - 1; i++){
            res += array[i];
        }

        if(res % 2 == 0){
            return "even";
        } else{
            return "odd";
        }
    }


}
