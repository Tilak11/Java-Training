package weekTwo;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class KurajipoException extends Exception {

	public KurajipoException(String message) {
		super(message);
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> pathToAkshardham = new ArrayList<>();
		pathToAkshardham.add("Niyam Dharma");
		pathToAkshardham.add("Samp");
		pathToAkshardham.add("Divyabhav");
		pathToAkshardham.add("Mahima");
		pathToAkshardham.add("Vanchan");
		pathToAkshardham.add("Abhav Avgun");
		pathToAkshardham.add("Daspanu");
		
		System.out.println("Path to Akshardham: ");

		// Goes over the list and if it contains Abhav Avgun
		// than custom exception is thrown and handled by catch
		// clause by removing that element
		for (int i = 0; i < pathToAkshardham.size(); i++) {
			try {
			if(pathToAkshardham.get(i).equalsIgnoreCase("Abhav Avgun")) {
				throw new KurajipoException("Abhav Avgun detected: Accident!!!! Start again. \n ");
			}
			System.out.println((i+1) + " " + pathToAkshardham.get(i));
			}catch(Exception e) {
				System.out.println(e.getMessage());
				pathToAkshardham.remove(i);
				i=-1;
			}
			
		}
		System.out.println("Mission Accomplished. ");

	}


	

}
