package org.javaacademy.wonder_field;

import java.util.Scanner;

public class Game extends AbsData {
	private final int NUMBER_OF_PLAYERS = 3;
	private final int NUMBER_OF_ROUNDS = 4;
	private final int NUMBER_OF_GROUP_ROUNDS = 3;
	private final int INDEX_OF_FINAL_ROUND = 3;

	private static Scanner scanner; // что с ним делать?

	private String[] question = new String[256];
	private String[] answer = new String[64];

	private DataSet dataSet = new DataSet();
	public Game(){
	}
	public void init(){ // инициализация игры
		System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.Вам нужно ввести вопросы " +
				"и ответы для игры");
		getData();






	}



}
