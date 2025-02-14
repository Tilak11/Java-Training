package weekTwo;

import java.util.ArrayList;
import java.util.Collections;


public class MergeList {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
			l1.add(i*6);
			l2.add(i);
		}
		System.out.println("Sorted L1: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("Sorted L2: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(l2.get(i));
		}
		System.out.println("After combining and sorting both lists: ");
		
		l1.addAll(l2);
		Collections.sort(l1);
		
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
	}

}
