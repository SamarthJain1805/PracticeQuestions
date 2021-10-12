package practiceQuestions;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		
		System.out.print("Enter the Operation : ");
		sc.nextLine();
		
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		switch(operation) {
		case '+':
			result = a+b;
			break;
			
		case '-':
			result = a-b;
			break;	
			
		case '*':
			result = a*b;
			break;	
			
		case '/':
			result = a/b;
			break;	
			
		default:
			System.out.println("Invalid Operation.");
			
		}
		System.out.println("The result is "+result);
	}

}
//Problem 17: 
//	Implement a basic calculator
//Input	: Two integers and a string that is one of the possible integer operations
//Output  : Output the answer of the operation on the two integers
//	Ex: 21
//	       7
//	       /
//	      Output: 3

//TODO: when I input the first number as string "hh", it throws java.util.InputMismatchException
//Handle the exception if a user inputs wrong data type instead of Integer.

/**
 * Use case 1:
 * Enter the first number : 33
 * Enter the second number : 3
 * Enter the Operation : --
 * The result is 30
 *
 * I entered the operation -- and it took this as a substract operator.
 * this should have resulted in invalid operator, right?
 */