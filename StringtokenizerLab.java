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
		sum=sum+Number;
		}
		System.out.println("Sum of numbers:"+sum);

	

}
}
