package practiceQuestions;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println("The number is even.");
		}else {
			System.out.println("The number is odd.");
		}

	}

}

//Problem 8: 
//	Check to see if a number is even or odd
//Input	: Input an integer
//Output : If the integer is even print �even� else print �odd�.
