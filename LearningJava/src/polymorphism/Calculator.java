package polymorphism;

public class Calculator {
	
	public void doAdd() {
		System.out.println("First add method");
	}
	
	public void doAdd(int a) {
		System.out.println("Second add method");
	}
		
	public void doAdd(int a, int b) {
		int sum = a+b;
		System.out.println("Third add method; Addition of two methods: " +sum);
	}
	
	public void doAdd(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("Fourth add method; Addition of three methods: " +sum);
	}
	
	public void doAdd(int a, double b, int c) {
		double sum = a+b+c;
		System.out.println("Fifth add method; Addition of three methods: " +sum);
	}
	
	

	

}
