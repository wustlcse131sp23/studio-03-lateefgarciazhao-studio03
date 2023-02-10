package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers would you like to find the prime numbers for?");
		int n = in.nextInt();

		boolean[] totalNumbers = new boolean[n];
		for (int i= 0; i < totalNumbers.length; i++) {
			totalNumbers[i]= true;
		}

			for (int i=2; i < totalNumbers.length; i+=2) {
				totalNumbers[i]=false;
			}
			for (int i=3; i < totalNumbers.length; i+=3) {
				totalNumbers[i]=false;

		}




	}

}
