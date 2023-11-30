package lab.trial;

import java.util.Scanner;

class printTable{
	public synchronized void printMultiplicationTable(int Number) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+Number+"="+i*Number);
		}
		
	}
}

class Thread1 extends Thread{
	printTable print ;
	int number1;
	Thread1(printTable m,int number1){
		this.print=m;
		this.number1=number1;
		
		
	}
	public void run() {
		print.printMultiplicationTable(number1);
	}
	
	
}
class Thread2 extends Thread{
	printTable print ;
	int number2;
	Thread2(printTable n,int number2){
		this.print=n;
		this.number2=number2;
	
}
	public void run() {
		print.printMultiplicationTable(number2);
	}
	
}
class Thread3 extends Thread{
	printTable print ;
	int number3;
	Thread3(printTable n,int number3){
		this.print=n;
		this.number3=number3;
	
}
	public void run() {
		print.printMultiplicationTable(number3);
	}
	
}	

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number in first thread");
		int firstNumber=sc.nextInt();
		System.out.println("enter number in second thread");
		int secondNumber=sc.nextInt();
		System.out.println("enter number in third thread");
		int thirdNumber=sc.nextInt();


		printTable table=new printTable();
		Thread1 thread1=new Thread1(table,firstNumber);
		Thread2 thread2=new Thread2(table,secondNumber);
		Thread3 thread3=new Thread3(table,thirdNumber);
		/*thread1.setPriority(3);
		thread2.setPriority(2);
		thread3.setPriority(1);*/
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
	

}
