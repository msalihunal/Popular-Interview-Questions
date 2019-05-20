package popular_interview_questions;

import java.util.Scanner;

public class _002_Fibonacci {
	
	public static void main(String[] args) {
		
	 int previousNumber=0;
	 int nextNumber=1;
	 int maxNumber=0;
	 
	 Scanner scan=new Scanner(System.in);
	 
	 System.out.println("How many numbers you want in Fibonacci?");
	 
	 maxNumber=scan.nextInt();
	 
	 System.out.println("First "+maxNumber+" Fibonacci numbers");
	 
	 for(int i=0;i<=maxNumber;i++) {
		 
		 System.out.print(previousNumber+" ");
		 
		 
		 int sum=previousNumber+nextNumber;
		 previousNumber=nextNumber;
		 nextNumber=sum;
		 
	 }
	 
	 
	}

}
