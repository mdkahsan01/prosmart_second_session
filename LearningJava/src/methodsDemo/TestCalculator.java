package methodsDemo;

public class TestCalculator {

	public static void main(String[] args) {
		
		//Creates an OBJECT of Calculator CLASS
		Calculator calc = new Calculator();
		//calc.doAdd(25, 12);
		System.out.println(calc.doAdd(25, 12));
		
		
		//calc.doSub(30, 15);
	
		System.out.println(calc.doSub(30, 15));
		System.out.println(calc.concatStr("Hey", "How is everything?"));
		
		TestCalculator obj = new TestCalculator();
		System.out.println(obj.doMul(54, 95));
		System.out.println(obj.doDiv(34, 7));
		


	}
	public int doMul (int a, int b){
		int c = a*b;
		return c;
	}
	public static double doDiv(int a, int b) {
		double c = a/b;
		return c;
	}
	public void sound() {
		System.out.println("This is generic Sound");
	}
	public void dogSound() {
		sound();
		System.out.println("I can also make Dog Sound");
	}
	public void catSound() {
		System.out.println("I can also make Cat Sound");
	}
	public static int do3mul(int a, int b, int c) {
		int result = a * b * c;
		return result;
	}

}
