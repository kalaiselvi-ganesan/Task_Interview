package javaPgms;
class add1{
	int add(int a, int b)
	{
		System.out.println("add1 method: " +(a+b));
		return 0;
	}

}
class add2 extends add1{
	int add(int a, int b)
	{
		System.out.println("add2 method: " +(a+b));
		return 0;
	}
}
public class OverRidding {
	public static void main(String[] args) {
		add1 obj = new add1();
		obj.add(78,98);

	}

}