package practiceQuestions;

import java.util.Scanner;

public class MultiplesOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three integers m,n and k: ");
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i =1;i<k;i++) {
			
			if(i%m == 0 || i%n==0) 
				System.out.print(i+" ");
			
		}
		
	}

}

//Problem 11: 
//	Print all the multiples of m and n below a given number
//Input	: Three integers m, n and k
//Output : Print all the multiples of m and n below that number k without including k.
