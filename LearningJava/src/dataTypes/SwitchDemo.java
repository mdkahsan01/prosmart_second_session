package dataTypes;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		/* Switch Statement Syntax
		 * Switch (expression){
		 * case value1:
		 *code to be executed
		 *break;
		 *case value2:
		 *code to be executed
		 *break;
		 *case value3:
		 *code to be executed
		 *break;
		 *default:
		 *code to be executed
		 * */
		int dayNumber = 9;
		
		
		switch (dayNumber) {
		case 1:{
			System.out.println("MON");
		}
		break;
		case 2:{
			System.out.println("Tue");
		}
		break;
		case 3:{
		System.out.println("Wed");
		}
		break;
		case 4:{
			System.out.println();
		}
		break;
		case 5:{
			System.out.println();
		}
		break;
		case 6: {
			System.out.println();
		}
		break;
		case 7:{
			System.out.println();
		}
		break;
		default:
			System.out.println("No day Found");
			
		}
		
		
		
	}

}
