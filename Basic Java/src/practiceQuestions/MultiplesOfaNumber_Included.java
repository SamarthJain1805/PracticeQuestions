package practiceQuestions;

import java.util.Scanner;

public class MultiplesOfaNumber_Included {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number : ");
         int n = sc.nextInt();
         
         for(int i=1;i<n;i++) {
        	 
//        	 if(i%3 == 0)
//        		 System.out.print(i+" ");
        	 
        	 if(i%3==0 || i%5==0 ) {
        		 System.out.print(i+" ");
        	 }
        		 
         }
	}

}

//Problem 9: 
//	Print all the multiples of 3 below a given number
//Input	: An integer
//Output : Print all the multiples of 3 below that number, that number not included

//Problem 10: 
//	Print all the multiples of 3 and 5 below a given number
//Input	: An integer
//Output : Print all the multiples of 3 and 5 below that number with that number included.

