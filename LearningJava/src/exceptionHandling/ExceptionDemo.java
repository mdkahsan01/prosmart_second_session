package exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		System.out.println("Let us figure out an exception");
		String[] name = {"Prosmart", "Java", "Selenium", "Eclipse"};
		
		//Below we pass the index 4 but we have only 5 arrays, should be max 3.
		System.out.println(name[5]);
		
		} catch(Exception e) {
			System.out.println("Exception Occured! "+e.getMessage());
			System.out.println("Exception Occured! "+e.fillInStackTrace());
			System.out.println("Exception Occured! "+e.getCause());

			System.out.println("O my God! I could handle One.");
		}

		
		
	/*	//Exception with TRY CATCH
		try
		{
			
		}
		catch(IOException) {
			System.out.println("Something went wrong!!"e.getMessage());
		}finally {
			
		}*/
		
		
		
		
		

	}

}
