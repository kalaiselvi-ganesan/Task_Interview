package javaPgms;

import java.util.Scanner;

public class ArmstorngNumber {

	public static void main(String[] args) {
		System.out.println("Enter number to check armstrong number or not");
		Scanner am= new Scanner(System.in);
		int num, pow =0, temp,i=0;
		double arm=0;
		num=am.nextInt();
		am.close();
		temp=num;
		while(temp >0) {
			i = temp %10;
			temp =temp/10;
			pow++;
			}
		temp = num;
		while(temp>0) {
			i=temp%10;
			arm = arm+(Math.pow(i,pow));
			temp=temp/10;
		}
		if(num==arm) 
			System.out.println(num +" is an armstrong number");
		else
			System.out.println(num + " is NOT an armstrong number");
	}

}
