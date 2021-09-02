package practiceQuestions;

import java.util.Scanner;

public class Rangecheck{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int n = sc.nextInt();
		
		if(n<5 || n>10) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	
		

	}

}

//Problem 7: 
//	Range check a number
//Input	: An integer is to be taken as an input
//Output : If the integer is less than 5 or greater than 10, then 1 must be printed on the screen else 0 must be printed on the screen

