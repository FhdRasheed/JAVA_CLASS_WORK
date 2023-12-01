/***************************************************************************************
 * File                    :  MultithreadingOddEven.java
 * Description             :  The code is a java program with threads generating random numbers
 *                            and printing their squares or cubes based on parity. 
 * Author                  :  Fahad Rasheed
 * Version                 :  1.0
 * Date                    :  1/12/2023
 * *********************************************************************************************
 */
package new_java_lab;
import java.util.Random;
class numberManager{
	int generatedNum;
	boolean numberGenerated=false;
	
	public synchronized void generateNumber() {
		generatedNum =new Random().nextInt(99)+2;
		System.out.println("Generated Number:"+generatedNum);
		
		numberGenerated=true;
		
		notifyAll();
	}
	public synchronized void squareCalculation() {
		try {
		while(!numberGenerated||generatedNum%2!=0) {
			wait();
		}
		System.out.println("Random number is even,Square:"+generatedNum*generatedNum);
		
		numberGenerated=false;
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void cubeCalculation() {
		try {
		while(!numberGenerated||generatedNum%2==0) {
			wait();
		}
		
		System.out.println("Random number is odd,Cube:"+generatedNum*generatedNum*generatedNum);
		
		numberGenerated=false;
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class generateNumber extends Thread{
	
	numberManager manager;
	public generateNumber(numberManager manager) {
		
		this.manager= manager;
		
	}
	public void run() {
		while(true) {
			manager.generateNumber();
			
			
			try {
			
				
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class EvenTread extends Thread{
	numberManager manager;
	public EvenTread(numberManager manager) {
		this.manager=manager;
		
	}
	public void run() {
		while(true) {
			manager.squareCalculation();
		}
	}
}

class OddTread extends Thread{
	numberManager manager;
	public OddTread(numberManager manager) {
		this.manager=manager;
		
	}
	public void run() {
		while(true) {
			manager.cubeCalculation();
		}
	}
}

public class MultithreadingOddEven {
	
	public static void main(String[] args) {
		numberManager manager=new numberManager();
		generateNumber generate=new generateNumber(manager);
		OddTread odd=new OddTread(manager);
		EvenTread even=new EvenTread(manager);
		
		generate.start();
		odd.start();
		even.start();
	}

}
