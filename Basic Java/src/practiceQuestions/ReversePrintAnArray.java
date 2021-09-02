package practiceQuestions;

import java.util.Scanner;

public class ReversePrintAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		
		System.out.println("Enter the elements of array.");
		
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		
		System.out.print("Forward : ");
		for(int i=0;i<a.length;i++) {
		if(i<9) {
			System.out.print(a[i]+", ");
		  }else {
			  System.out.print(a[i]);
		  }
		}
		
		System.out.println(); 
		
		System.out.print("Reverse : ");
		for(int i=9;i>=0;i--) {
			if(i>0) {
				System.out.print(a[i]+", ");
			  }else {
				  System.out.print(a[i]);
			  }
		}
	}
	
	

}
//Problem 13: 
//	Reverse print an array
//Input	: An array of 10 integers
//Output	: Print the array in the order in which it was given and also in the reverse direction like this (with commas).
//		Forward : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//		Reverse : 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
