package test;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int square = num * num;

        if (square % (int)Math.pow(10, String.valueOf(num).length()) == num)
            System.out.println(num + " is an Automorphic Number.");
        else
            System.out.println(num + " is Not an Automorphic Number.");

        sc.close();
    }
}