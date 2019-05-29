package popular_interview_questions;

import java.util.Scanner;

public class _009_PrimeNumbers {
	
	
	
	
	/*
	 * What is prime number?
	 * A prime number is a number which is greater than 1 and divisible by either 1 or itself.
	 * 
	 * 
	 * 
	 * Prime number is not divisible by any number other than 1 and itself.
	 */
	
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter the number till which prime number to be printed: ");
		
		int limit=scan.nextInt();
		
		
		System.out.println("Printing prime numbers from 1 to "+ limit);
		
		
		for(int number =2;number<=limit;number++) {
			
			if(isPrime(number)) {
				
				System.out.print(number+" ");
				
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
public static boolean isPrime(int number) {
	
	
	for(int i=2;i<number;i++) {
		
		if(number%i==0) {
			
			return false;
		}
	}
	return true;
}
	
	
	
	
	
	
	
	
	
	
	
}

	
	