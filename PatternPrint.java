package javaPgms;

public class PatternPrint {

	public static void main(String[] args) {
		PatternPrint pp = new PatternPrint();
		pp.ques13();
		pp.ques25();

	}

	private void ques25() {
		System.out.println("Pattern Print:");
		for(int row=1;row<=5; row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private void ques13() {
		System.out.println("Pattern Print:");
		for(int row=1;row<=6; row++) {
			if(row==3)
				continue;
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
