package javaPgms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter number to check Even or Odd: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		if(num%2==0) {
			System.out.println(num + " is Even number");}
		else {
			System.out.println(num + " is Odd number");}
		}

}
