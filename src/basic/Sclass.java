package basic;
import java.util.Scanner;
public class Sclass {
 public static void main(String args []) {
	 Scanner input = new Scanner (System.in);
	 
	 System.out.print("input first num:");
	 int num1 = input.nextInt();
 System.out.print("input second num");
     int num2 = input.nextInt();
 
     System.out.println("num1" +  "+"  + "num2" + "=" + (num1 + num2));
      
     
     System.out.println("num1" +  "-"  + "num2" + "=" + (num1 - num2));
     
     System.out.println("num1" +  "*"  + "num2" + "=" + (num1 * num2));
     
     System.out.println("num1" +  "/"  + "num2" + "=" + (num1 / num2));
 
 }
}
