package new_java_lab;

import java.util.LinkedList;
import java.util.Scanner;

class DoublyLinkedList<T> {
    private LinkedList<T> list = new LinkedList<>();
    
    public void addbegin(T element) {
    	list.addFirst(element);
    }

    
    public void add(T element) {
        list.addLast(element);
    }

    
    public void insert(int index, T element) {
        list.add(index, element);
    }

   
    public void remove(int index) {
        list.remove(index);
    }

    
    public void display() {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Linkedlist {
    public static void main(String[] args) {
    	
    	
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        
        int choice=0,element;
        System.out.println("    Menu");
        System.out.println("1.Insert at beggining");
        System.out.println("2.Insert at End");
        System.out.println("3.Insert at any position");
        System.out.println("4.Deletion at any position");
        System.out.println("5.Display");
        System.out.println("6.Exit");
        
        Scanner sc=new Scanner(System.in);
        
        while(choice!=6) {
        	
        	System.out.println("Enter your choice");
        	choice=sc.nextInt();
        	
        	if(choice==1) {
        		System.out.println("Enter element to be inserted");
        		element=sc.nextInt();
        		doublyLinkedList.addbegin(element);
        	}
        	
        	else if(choice==2) {
        		System.out.println("Enter element to be inserted");
        		element=sc.nextInt();
        		doublyLinkedList.add(element);
        	}
        	
        	else if(choice==3) {
        		System.out.println("Enter the position");
        		int pos=sc.nextInt();
        		System.out.println("Enter the element to be inserted");
        		element=sc.nextInt();
        		try {
        		doublyLinkedList.insert(pos,element);
        		
        	}catch(IndexOutOfBoundsException e) {
        		System.out.println("Enter a valid position");
        	}
        	}
        	else if(choice==4) {
        		System.out.println("enter the position");
        		int pos=sc.nextInt();
        		try {
        		doublyLinkedList.remove(pos);
        	}catch(IndexOutOfBoundsException e) {
        		System.out.println("Enter a valid position");
        	}
        	}
        	else if(choice==5) {
        		doublyLinkedList.display();
        	}
        	else if(choice==6){
        		break;
        	}
        	else{
        		System.out.println("Invalid choice");
        		
        	}
        	
        		
        	}
        System.out.println("Exiting from the program...");
        

        
    }
}