package popular_interview_questions;

import java.util.Scanner;

public class _001_StringPalindrome {

	
	public static void main(String[] args) {
		
	
	
	String word="";
	String reverse="";
	
	Scanner scan=new Scanner (System.in);
	
	System.out.println("Enter the word you want to check");
	
	word=scan.nextLine();
	
	for(int i=word.length()-1;i>=0;i--) {
		
		reverse+=word.charAt(i);
		
		
	}
	
	if(word.equalsIgnoreCase(reverse)) {
		
		System.out.println("The word is palindrome");
	}else {
		
		System.out.println("The word is not palindrome");
		
	}
	
	
	
	
}
}