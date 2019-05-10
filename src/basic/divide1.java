package basic;

import java.util.Scanner;

public class divide1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("input first num:");
		int a = input.nextInt();

		System.out.print("input secound num:");
		int b = input.nextInt();
		int d = (a / b);
		System.out.println();
		System.out.println("d:  " + d);

	}
}
