package practiceQuestions;

import java.util.Scanner;

public class StringOfTwoChars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two characters :");
		
		char char1 = sc.next().charAt(0);
		char char2 = sc.next().charAt(0);
		
		System.out.println("\"Hello "+ char1 +" and "+char2 +" !!\"");		
		
	}

}

//Problem 5: 
//	Make a string out of two characters
//Input	: Input two characters
//Output : A string as follows is supposed to be printed on the output
//	�Hello �char1� and �char2� !!� is supposed to be printed on the screen.
