package popular_interview_questions;

import java.util.Scanner;

public class _007_PyramidOfNumbers {


	
	
public static void main(String[] args) {
		
		
		
		
		/*
		 * Take the input from the user and assign it to noOfRows. 
		 * This will be the number of rows he wants in a pyramid. Define one variable called rowCount and initialize it to 1.
		 * This will hold the value of current row count. At the beginning of each row, we print ‘i’ spaces where ‘i’ will be value from noOfRows to 1. 
		 * At the end of each row, we print rowCount value rowCount times. i.e in the first row, 1 will be printed once. 
		 * In the second row, 2 will be printed twice and so on. Below is the java code which implements this logic.
		 *  
		 */
		
		
		
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("How many rows you want in your pyramid?");
		
		int noOfRows=scan.nextInt();
		
		
		int rowCount=1;
		
		System.out.println("Here is your pyramid");
		
		
		
		for(int i=noOfRows;i>0;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			
			
			
			for(int j=1;j<=rowCount;j++) {
				
				System.out.print(rowCount+ " ");
				
			}
			
			System.out.println();
			
			rowCount++;
			
		}
	}
	
}

