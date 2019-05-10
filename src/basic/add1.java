package basic;
import java.util.Scanner;

public class add1 {
 public static void main(String args[]) {
	 Scanner input = new Scanner (System.in);
	 System.out.print("input the first number:");
	 int numf = input.nextInt();
	 System.out.print("input the second num:");
	 int nums = input.nextInt();
	 int sum = numf + nums;
	 System.out.println();
	 System.out.println("Sum:  " + sum);
	 
 }
}
