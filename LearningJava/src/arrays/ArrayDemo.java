package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//declaring Array
		String[] myArray = new String[3];
		//Assigning value to the array
		myArray[0] = "Selenium";
		myArray[1] = "Eclipse";
		myArray[2] = "Java";
		
		System.out.println(myArray);
		
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		//Another way of Array
		int[] number = {4,2,7};
		for(int j=0; j<number.length; j++) {
			System.out.println(number[j]);
		}
		
		//Enhanced For loop
		System.out.println("Example of enhanced for loop:");
		for(int val: number) {
			
			System.out.println(val);
			
		}
		
		
		
		
		
		
		
		

	}

}
