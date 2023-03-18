package inheritance;

public class Test implements InterfaceDemo{

	public static void main(String[] args) {
		
//		Test obj = new Test();
//		obj.makeSound();
//		
		
		ConstructorDemo obj1 = new ConstructorDemo("Kamrul", 001);
		obj1.setName("Kamrul");
		obj1.setRollNo(001);
		System.out.println(obj1.getName());

	}

	@Override
	public void makeSound() {
		
		System.out.println("Please Sing a song");
		
		
		
		
	}

}
