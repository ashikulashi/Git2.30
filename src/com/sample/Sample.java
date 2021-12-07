package com.sample;

public class Sample {

	public static void main(String[] args) {

		// Array syntax

		int a[] = new int[5];

		a[2] = 60;

		a[4] = 70;
		a[0] = 20;
		a[2] = 30;
		a[3] = 60;

		System.out.println(a[2]);

		System.out.println(a.length);

		// normal for loop
		System.out.println("\nNormal ForLoop");
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

		// Enhnaced forLoop

		System.out.println("\nEnhnaced Forloop");
		for (int z : a) {

			System.out.println(z);

		}

	}

}
