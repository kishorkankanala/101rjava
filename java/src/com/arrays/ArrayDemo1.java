package com.arrays;
public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        System.out.println("Unique elements are:");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}