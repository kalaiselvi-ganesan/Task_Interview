package javaPgms;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println("Method Overloading:");
		mo.methodoverload("Kalaiselvi",25000);
		mo.methodoverload(9,10,14.5f);

	}

	private void methodoverload(int a, int b, float c) {
		System.out.println("add result: "+(a+b+c));

	}

	private void methodoverload(String name, int salary) {
		System.out.println("Name: "+ name+" " +"Salary: "+ salary);
	}


}
