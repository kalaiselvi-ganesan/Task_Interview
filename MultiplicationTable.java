package javaPgms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner ml= new Scanner(System.in);
		int mplicand,result;
		System.out.println("Enter multiplicand: ");
		mplicand = ml.nextInt();
		ml.close();
		for(int rep=1;rep<=10;rep++) {
			result= rep*mplicand;
			System.out.println(rep+ " * "+ mplicand+" = "+result);
		}
		

	}

}
