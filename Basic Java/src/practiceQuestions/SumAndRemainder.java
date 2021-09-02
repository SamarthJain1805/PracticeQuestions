package practiceQuestions;

import java.util.Scanner;

public class SumAndRemainder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int a = sc.nextInt();	
		int b = sc.nextInt();
		
		int sum = a+b;
		int remainder = a%b;
		
		System.out.println(sum+"	"+remainder);
		
	}

}

//Problem 3: 
//	Implement a basic program to calculate the sum and remainder.
//Input	: Two integers
//Output : The program must output the sum and the remainder of the two input integers on the same line with a tab of sp
