import java.util.Scanner;

class Area{
		void area(float r) {
			float area=3.14f*r*r;
			System.out.println("Area of the circle is "+area);
		
		}
		void area(float base,float height) {
			float area=(base*height)/2;
			System.out.println("Area of the triangle is "+area);
		}
		void area(int length,int breadth) {
			int area=length*breadth;
			System.out.println("Area of the rectangle is "+area);
		}
		void area(int side) {
			int area=side*side;
			System.out.println("Area of the square is "+area);
		}
		
	}


public class MethodOverloading {
	public static void main(String []args) {
		Area area=new Area();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the radius of the circle");
		float radius=sc.nextFloat();
		
		
		System.out.println("Enter the base length of the triangle");
		float base=sc.nextFloat();
		System.out.println("Enter the height of the triangle");
		float height=sc.nextFloat();
		
		
		System.out.println("Enter the length of the rectangle");
		int length= sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int breadth=sc.nextInt();
		
		
		System.out.println("Enter the side of the square");
		int side=sc.nextInt();
		
		area.area(radius);
		area.area(base, height);
		area.area(length, breadth);
		area.area(side);
		
		
	}
	
}
