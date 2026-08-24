package test;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int rem = temp % 10;

            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num)
            System.out.println(num + " is a Strong Number.");
        else
            System.out.println(num + " is Not a Strong Number.");

        sc.close();
    }
}