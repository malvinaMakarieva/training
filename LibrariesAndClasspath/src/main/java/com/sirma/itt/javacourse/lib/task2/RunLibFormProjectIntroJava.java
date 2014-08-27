package com.sirma.itt.javacourse.lib.task2;

import com.sirma.itt.javacourse.intro.array.Array;

public class RunLibFormProjectIntroJava {

	public static void main(String[] args) {
		float array[];

		Array arrayFunction = new Array();

		array = arrayFunction.readArrayFromConsolFloat();

		System.out.println("Array elemets are " + arrayFunction.print(array));

		System.out.println("Minimal element is " + arrayFunction.getMinElement(array));

		System.out.println("Sum is " + arrayFunction.sum(array));
	}
}
