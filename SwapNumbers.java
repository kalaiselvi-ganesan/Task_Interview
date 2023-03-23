package javaPgms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		//swap two numbers without using temporary variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = sc.nextInt();
		sc.close();
		System.out.println("Before swapping:"+"\n" + "num1 " + n1 +""+" num2 "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping:"+"\n" + "num1 " + n1 +""+" num2 "+n2);
	}

}
