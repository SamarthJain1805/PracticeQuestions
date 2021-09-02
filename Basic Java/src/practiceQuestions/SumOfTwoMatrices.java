package practiceQuestions;
import java.util.Scanner;
public class SumOfTwoMatrices{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no. of rows : ");
		int rows = sc.nextInt();
		
		System.out.print("Enter the no. of columns : ");
		int cols = sc.nextInt();

		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		int c[][] = new int[rows][cols];
		
		
		System.out.println("enter the elements of matrix a : ");
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			a[i][j] = sc.nextInt();	
			}
		}
		
		System.out.println("enter the elements of matrix b : ");
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			b[i][j] = sc.nextInt();	
			}
		}
		
		System.out.println("The sum of the two matrices are : ");
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			c[i][j] = a[i][j]+b[i][j];	
			
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}


//Problem 16: 
//	Print the sum of two matrices
//Input	: Input two matrices into two separate two dimensional 
//Output 	: Output the sum of the two matrices.
