package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThroughableDemo {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Exception Does not make any sense to me!!");
		
		Thread.sleep(3000);
		try {(FileInputStream fis = new FileInputStream("")) 
		} catch (FileNotFoundException e) {
			System.out.println("Pledase check the file path");
			e.printStackTrace();
		}
		
		System.out.println("May be it is something, not sure about the use of it.");
		
		
		
		
		

	}

}
