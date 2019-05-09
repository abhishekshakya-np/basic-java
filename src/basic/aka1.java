package basic;
import java.util.Scanner;
public class aka1 {
	private static Scanner input;

	public static void main(String []args) {
		
		input = new Scanner (System.in);
		System.out.print("input the first name:");
		String fname = input.next();
		System.out.print("input the last name:");
		String lname = input.next();
		System.out.println();
		System.out.println("hello \n" + fname +" "+ lname);
		
	}

}
