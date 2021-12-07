package com.sample;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList {

	public static void main(String[] args) {

		// syntax for List

		// Instanciation
		List li = new ArrayList();

		li.add(50);// index 0
		li.add("Ashik");// index 1
		li.add(765645.7467447f);// index 2
		li.add('M');// index 3
		li.add(true);// index 4
		li.add(50);// index 5
		li.add(null);// index 6

		System.out.println(li);

		Object object = li.get(3);
		System.out.println(object);

		int size = li.size();
		System.out.println(size);

		// normal forLoop
       System.out.println("Using normal forLoop");
		for (int i = 0; i <li.size(); i++) {
			
			Object object2 = li.get(i);
			System.out.println(object2);

		}
		
		//enhanced ForLoop
		System.out.println("\nEnhanced ForLoop");
		for (Object c : li) {
			
			System.out.println(c);
			
		}

	}

}
