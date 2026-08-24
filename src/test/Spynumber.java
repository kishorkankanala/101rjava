package test;
	import java.util.Scanner;

	public class Spynumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int temp = num;
	        int sum = 0;
	        int product = 1;

	        while (temp > 0) {
	            int digit = temp % 10;
	            sum = sum + digit;
	            product = product * digit;
	            temp = temp / 10;
	        }

	        if (sum == product) {
	            System.out.println(num + " is a Spy Number.");
	        } else {
	            System.out.println(num + " is not a Spy Number.");
	        }

	        sc.close();
	    }
	}


