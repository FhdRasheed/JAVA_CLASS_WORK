package java_s3_061;
import java.util.Scanner;
public class Overriding {
	public static void main(String[]args) {
		Officer officer=new Officer();
		Manager manager=new Manager();
		System.out.println("enter the details of officer");
		officer.getdetails();
		officer.getspecialization();
		System.out.println("enter the details of manager");
		manager.getdetails();
		manager.getdepartment();
		System.out.println("officer details:");
		officer.Printdetails();
		officer.printspecialization();
		System.out.println("manager details:");
		manager.Printdetails();
	manager.printdepartment();	
	}
}
 class Employee{
	 int age,salary;
	 long phoneNo;
	 String name,address;
	 Scanner sc=new Scanner(System.in);
	 public void getdetails() {
		 System.out.println("enter the name");
		 name= sc.nextLine();
		 System.out.println("enter the age");
		 age=sc.nextInt();
		 System.out.println("enter the phone number");
		 phoneNo=sc.nextLong();
		 System.out.println("enter the salary");
		 salary=sc.nextInt();
		 System.out.println("enter the address");
		 sc.nextLine();
		 address=sc.nextLine(); 
	 }
	 public void Printdetails(){
		 System.out.println("Name="+name);
		 System.out.println("Age="+age);
		 System.out.println("mobile Number="+phoneNo);
		 System.out.println("Address="+address);
		 System.out.println("salary="+salary);
	 }
}
 class Officer extends Employee {
	 String specialization;
	 public void getspecialization() {
		 sc.nextLine();
		 System.out.println("enter the specialization of officer");
		 specialization=sc.next();
		  }
	 public void printspecialization() {
		 System.out.println("specialization="+specialization);
	 }
 }
 class Manager extends Employee{
	 String department;
	 public void getdepartment() {
		 sc.nextLine();
		 System.out.println("enter the department of manager");
		 department=sc.nextLine();	 
	 }
	 public void printdepartment() {
		 sc.nextLine();
		 System.out.println("Department="+department);
	 }
 }
 