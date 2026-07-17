package test;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        int divisor = 1;

        for (int i = 1; i <= digits; i++) {
            divisor = divisor * 10;
        }

        if (square % divisor == num) {
            System.out.println(num + " is an Automorphic Number.");
        } else {
            System.out.println(num + " is not an Automorphic Number.");
        }

        sc.close();
    }
}