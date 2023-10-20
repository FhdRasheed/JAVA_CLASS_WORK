package files_java;

import java.util.Scanner;



public class Absract_program {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	Rectangle rectangle = new Rectangle();

	Triangle triangle = new Triangle();

	Hexagon hexagon = new Hexagon();

    rectangle.numberOfSides();

    triangle.numberOfSides();

    hexagon.numberOfSides();

}


}

abstract class Shapes{

abstract public void numberOfSides();

	

}

class Rectangle extends Shapes{

public void numberOfSides() {

	System.out.println("Number of sides of Rectangle is 4");

	

}



}

class Triangle extends Shapes{

public void numberOfSides() {

System.out.println("Number of sides of Triangle is 3");



}

}

class Hexagon extends Shapes{

public void numberOfSides() {

	System.out.println("Number of sides of Hexagon is 6");

	

}

}




