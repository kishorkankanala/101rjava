	package test;

	import java.util.Scanner;

	public class Ugly {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int temp = n;

	        while (temp % 2 == 0) {
	            temp = temp / 2;
	        }

	        while (temp % 3 == 0) {
	            temp = temp / 3;
	        }

	        while (temp % 5 == 0) {
	            temp = temp / 5;
	        }

	        if (temp == 1) {
	            System.out.println(n + " is an Ugly Number");
	        } else {
	            System.out.println(n + " is Not an Ugly Number");
	        }

	        sc.close();
	    }
	}

