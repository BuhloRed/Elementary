package ua.hilel.hw4;

import java.util.Arrays;

public class Array {

    public void arraySort() {
        int[] arr = {0, 17, 8, 7, -4, -18};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("\noutput=" + Arrays.toString(arr));
    }
}
