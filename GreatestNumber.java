import java.util.Scanner;

public class GreatestNumber {
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber=sc.nextInt();
		System.out.println("Enter the second number");
		int secondNumber=sc.nextInt();
		System.out.println("Enter the third number");
		int thirdNumber=sc.nextInt();
		if(firstNumber>secondNumber&&firstNumber>thirdNumber) {
			System.out.println("greatest number is:"+firstNumber);
		}
		else if(secondNumber>thirdNumber) {
			System.out.println("greatest number is:"+secondNumber);
			
		}
		else {
			System.out.println("greatest number is:"+thirdNumber);
		}
			
		
	}

}
