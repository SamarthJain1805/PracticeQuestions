package practiceQuestions;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int sum = 0;
		float avg = 0;
		System.out.println("Enter the elements of array.");
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
			
			sum += a[i];
			avg = sum/10;
		}
		System.out.println("Sum : "+sum);
		System.out.print("Average : "+avg);
	}
        
}
//Problem 12:
//	Sum and average of certain numbers
//Input	: Input an array of 10 integers.
//Output: : Print the sum and average of the 10 numbers on separate lines like this
//		Sum : 25
//		Average : 2.5