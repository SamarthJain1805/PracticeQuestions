package practiceQuestions;

import java.util.Scanner;

public class PrintAnInputArray{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no. of rows : ");
		int rows = sc.nextInt();
		
		System.out.print("Enter the no. of cols : ");
		int cols = sc.nextInt();
		
		int a[][] = new int[rows][cols];
		System.out.println("Enter array a");
		
		for(int i=0; i<rows ; i++) {
			for(int j=0; j<cols; j++) {
				a[i][j] = sc.nextInt();	
			}			
		}
		
		System.out.println("The array is : ");
		for(int i=0; i<rows ; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(a[i][j]+" ");	
			}			
			System.out.println();
		}

	}

}
