package org.javaacademy.wonder_field;

import java.util.Scanner;

public abstract class AbsData {

	private final String[] QUESTION = new String[4];
	public void getData(){
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < QUESTION.length; i++){
			QUESTION[0] = scanner.nextLine();
		}
	}
}
