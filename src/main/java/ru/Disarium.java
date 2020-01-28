package ru;

public class Disarium {
    public static String disariumNumber(int number)
    {
        String temp = Integer.toString(number);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        int p = 1;
        int res = 0;
        for (int i = 0; i < newGuess.length; i++){
            res += power(newGuess[i], p);
            p++;
        }
        if (res == number){
            return "Disarium !!";
        }

        return "Not !!";
    }

    static int power(int a, int b){
        int result = 1;
        for (int i=1; i<=b; i++){
            result = result*a;
        }
        return result;
    }


}
