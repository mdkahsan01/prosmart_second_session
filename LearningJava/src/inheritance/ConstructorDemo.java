package inheritance;

public class ConstructorDemo {
	String name;
	int rollNo;
	
	
	public String getName() {
		return name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	//Example of Constructoe
	public ConstructorDemo(String name, int rollNo) {
		System.out.println("Iam a default Constructor");
	}
	
	

}
