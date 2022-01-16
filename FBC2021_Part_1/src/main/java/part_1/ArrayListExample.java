package part_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//Specified dtat type of ArrayList: String
		ArrayList <String> arraySet1 = new ArrayList<>();
		
		//Unspecified data type ArrayList
		ArrayList arraySet2 = new ArrayList();
		
		//adding to ArrayList 1
		arraySet1.add("C/C++");
		arraySet1.add("Java");
		arraySet1.add("HTML");
		arraySet1.add("Pyhton");
		arraySet1.add("CSS");
		//add to ArrayList 2
		arraySet2.add("Dog");
		arraySet2.add("Cat");
		arraySet2.add(3.14);
		arraySet2.add(2022);
		
		//getting the size of ArrayList 2
		int arrayLength2 = arraySet2.size();
		
		//Print the size of ArrayList 2
		System.out.println(arrayLength2);
		
		//print ArrayList as array
		System.out.println("ArrayList 1: " +arraySet1);
		System.out.println("ArrayList 2: " +arraySet2);
		
		//Access ArrayList item
		System.out.println("From the list of array: \n --- " + arraySet2.get(1));
		
		//change ArrayList element
		arraySet2.set(0, "JavaScript");
		System.out.println("Changed ArrayList 2: \n --- " +arraySet2);
		
		//Remove ArrayList element
		arraySet2.remove(3);
		System.out.println("Removed from ArrayList 2: \n --- " +arraySet2);
		
		
		//=================ArrayList Iteration methods ============================
		int arrayLength1 = arraySet1.size();
		//print a new line
		System.out.println("Iterate Elements of ArrayList1:");
		
		//Iterate using for loop
		for(int i=0; i<arrayLength1; i++) {
			System.out.println(arraySet1.get(i));
		}
		
		//Iterate using For...each loop
		for (String items: arraySet1) {
			System.out.println(items);
		}

	}

}
