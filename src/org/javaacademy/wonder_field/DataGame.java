package org.javaacademy.wonder_field;

import java.util.Scanner;

/*
 * ДАННЫЙ КЛАСС ЗАГРУЖАЕТ И ОТДАЕТ ДАННЫЕ (ВОПРОСЫ И ОТВЕТЫ) В МАССИВ СТРОК.
 */
public class DataGame {
	private final String[] dataIn;

	public DataGame() {
		this.dataIn = new String[8];
	}

	public String[] getDataGame() {
		return dataIn;
	}

	public void setDataGame() {

		System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.Вам нужно ввести вопросы " +
				"и ответы для игры: ");

		Scanner scanner = new Scanner(System.in);
		try {

			for (int i = 0; i < dataIn.length; i++) {
				dataIn[i] = scanner.nextLine();
			}

			System.out.println("Инициализация закончена, игра начнется через 5 секунд.....");
			Thread.sleep(5000);
			for (int i = 0; i <= 50; i++) {

				System.out.println();

			}

		} catch (InterruptedException exception) {
			InterruptedException interruptedException = new InterruptedException("Произошла неизвестная ошибка!");
			System.out.println(interruptedException.getMessage());
			interruptedException.printStackTrace();
		}
		scanner.close();
	}
}
