/***************************************************************************************
 * File                    :  StringtokenizerLab.java
 * Description             :  Java program that reads a line of integers,
 *                            and then displays each integer, 
 *                            and the sum of all the integers
 *  
 * Author                  :  Fahad Rasheed
 * Version                 :  1.0
 * Date                    :  25/11/2023
 * *********************************************************************************************
 */
package new_java_lab;
import java.util.StringTokenizer;
import java.util.Scanner;
public class StringtokenizerLab {
	public static void main(String[] args) {
		int Number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String data=sc.nextLine();
		StringTokenizer obj=new StringTokenizer(data);
		
		while(obj.hasMoreTokens()) {
		Number=Integer.parseInt(obj.nextToken());
		System.out.println(Number);
		sum=sum+Number;
		}
		System.out.println("Sum of numbers:"+sum);

	

}
}
