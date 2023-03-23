package javaPgms;

public class Question27 {

	public static void main(String[] args) {
		System.out.println("Pattern");
		for(int row=0;row<=7; row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.print(" * ");
		}
	}

}
