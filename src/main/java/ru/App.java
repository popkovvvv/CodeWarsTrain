package ru;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static ru.Arge.nbYear;
import static ru.Disarium.disariumNumber;
import static ru.OddOrEven.oddOrEven;
import static ru.StreamApi.train;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.err.println(oddOrEven(new int[] {2, 5, 34, 7}));
//        System.err.println(nbYear(1500, 5, 100, 5000));
//        System.err.println(disariumNumber(89));
//        System.err.println(digital_root(16));
//
        int[] arr = {34,232,55,213,4636,23};
        System.err.println("before: " + Arrays.toString(arr));

        quickSort(arr);
        int res = binarySearch(arr, 0, arr.length - 1, 232);
        System.err.println(res);
        System.err.println("after: " + Arrays.toString(arr));
        System.err.println("clear");

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt")))
        {
            Person p=(Person)ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

    public static int binarySearch(int[] arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = (l + r) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
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

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    private static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    public static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        int lastUnsorted = arr.length - 1;

        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSorted = false;
                }
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


}
