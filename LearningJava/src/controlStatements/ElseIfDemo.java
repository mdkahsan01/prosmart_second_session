package controlStatements;

public class ElseIfDemo {

	public static void main(String[] args) {
		
		/* Else if Syntax
		 * if (condition)
		 * {CODE TO BE EXECUTED
		 * } (else if (condition)
		 * {
		 * code to be executed
		 * }else
		 * {
		 * CODE TO BE EXECUTED
		 * }
		 */
		
		int age = 95;
		if (age>=18 && age <=80) {
			System.out.println("Good time to Marry");
	} else if(age>80 && age <=129) {
		System.out.println("Pray to God for good health");
	}else
	{
		System.out.println("You are too yong");
	}
	}

}
