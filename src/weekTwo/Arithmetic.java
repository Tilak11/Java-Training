package weekTwo;

import java.util.Iterator;

public class Arithmetic {

	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 0;
		
		try {
			System.out.println("In try: " + (num1+num2));
			int temp = num1/num2;
		}catch (ArithmeticException ae) {
			System.out.println("Exception occured!");
			
		}
		
		

	}

}
