package javaprogram1;

import java.util.Scanner;

public class CharFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        System.out.println("Enter the character to be checked");
        char check=sc.next().charAt(0);
        int charCount=checkFreq(input,check);
        System.out.println("the frequency is:"+charCount);
		
	}
	static int checkFreq(String input, char check) {
		char[]charArray=input.toCharArray();
		int length=input.length();
		int charCount=0;
		for(int i=0;i<length;i++) {
			if(charArray[i]==check) {
				charCount++;
			}
		}
	return charCount;
	}
}
