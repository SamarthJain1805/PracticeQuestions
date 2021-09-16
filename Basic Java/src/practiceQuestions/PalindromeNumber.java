package practiceQuestions;

import java.util.Scanner;

public class PalindromeNumber {
	
	static boolean isPalindrome(int n ) {
		int temp=n;
		int reversedNumber = 0;
		
		while(temp>0) {
			int lastDigit = temp%10;
			reversedNumber = reversedNumber*10+lastDigit;
			temp/=10;
		}
		if(reversedNumber==n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int n = sc.nextInt();
		
		System.out.println(isPalindrome(n));

	}

}
//palindrome number problem:a palindrome no. is no. which is equal to its reversed no.
//ex. 121 is palindrome,123 is not palindrome since reverse of 123 is 321 which is unequal to the given no.