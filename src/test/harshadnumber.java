package test;

import java.util.Scanner;

public class harshadnumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        if (n % sum == 0)
            System.out.println(n + " is a Harshad Number");
        else
            System.out.println(n + " is Not a Harshad Number");

        sc.close();
    }
}