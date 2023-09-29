package javaprogram1;


import java.util.Scanner;
public class Stringpalindrome {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.next();
        boolean ispalindrome=check(input);
        if(ispalindrome) {
	System.out.println("The given string is a palindrome");
}
else {
	System.out.println("The given string is not a palindrome");
}
	}



static boolean check(String input) {
	char[]charArray=input.toCharArray();
	int length=input.length();
	for(int i=0;i<=length/2;i++)
	{
		if(charArray[i]!=charArray[length-i-1]) {
			return false;
		}
	}
	return true;
}
}


