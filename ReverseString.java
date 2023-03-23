package javaPgms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//How do we reverse a string?
		System.out.println("Enter String to reverse:");
		Scanner inp = new Scanner(System.in);
		String text = inp.nextLine();
		inp.close();
		int len = text.length();
		String revStr = "";
		for(int i=len-1;i>=0;i--) {
			revStr = revStr + text.charAt(i);
		}
		System.out.println("Reversed string is "+revStr);
	}
}

