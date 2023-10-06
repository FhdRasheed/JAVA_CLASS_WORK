package java_s3_061;
/***************************************************************************************
 * File                    :  Matmul.java
 * Discription             :  multiplication of matrix
 * Author                  :  Fahad Rasheed
 * Version                 :  1.0
 * Date                    :  06/10/2023
 * *********************************************************************************************
 */

import java.util.Scanner;

public class Matmul {
	public static void main(String []args) {
		int row1,row2,column1,column2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter order of matrix1");
		row1=sc.nextInt();
		column1=sc.nextInt();
		System.out.println("Enter order of matrix2");
		row2=sc.nextInt();
		column2=sc.nextInt();
		if(column1==row2)
		{
		int[][] matrix1=new int[row1][column1];
		int[][] matrix2=new int[row2][column2];
		int[][] result=new int[row1][column2];
		
		System.out.println("Enter the numbers in matrix1");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter numbers in matrix2");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<column2;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column2;j++)
			{
				result[i][j]=0;
				for(int k=0;k<row2;k++)
				{
					result[i][j]=result[i][j]+(matrix1[i][k]*matrix2[k][j]);
				}
					
			}
		}
		System.out.println("The resultant matrix:");
		for(int i=0;i<row1;i++) 
		{
			for(int j=0;j<column2;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}
		else
		{
			System.out.println("Multiplication not possible");
		}

}
}
