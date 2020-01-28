package ru;

public class TidyNumber {
    public static boolean tidyNumber(int number)
    {
        String temp = Integer.toString(number);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }
        boolean isTidy = true;
        for (int i = 0; i < newGuess.length - 1; i++){
            if(newGuess[i] > newGuess[i + 1]){
                isTidy = false;
            }

        }
        return isTidy;
    }
}
