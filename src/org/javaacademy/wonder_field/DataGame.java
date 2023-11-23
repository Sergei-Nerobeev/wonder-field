package org.javaacademy.wonder_field;

import java.util.Scanner;

/*
 * ДАННЫЙ КЛАСС ЗАГРУЖАЕТ И ОТДАЕТ ДАННЫЕ (ВОПРОСЫ И ОТВЕТЫ) ДЛЯ ИНИЦИАЛИЗАЦИИ ИГРЫ В МАССИВ СТРОК.
 */
public class DataGame {

	private final String[] DATA_IN;

	public DataGame() {
		this.DATA_IN = new String[8];
	}

	public String[] getDataGame() {
		return DATA_IN;
	}

	public void setDataGame() {

		System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.Вам нужно ввести вопросы " +
				"и ответы для игры: ");

		Scanner scanner = new Scanner(System.in);
		try {

			for (int i = 0; i < DATA_IN.length; i++) {
				DATA_IN[i] = scanner.nextLine();
			}

			System.out.println("Инициализация закончена, игра начнется через 5 секунд...");
			Thread.sleep(5000);
			for (int i = 0; i <= 50; i++) {

				System.out.println();

			}
			System.out.println("__ЗАГРУЗКА ДАННЫХ УСПЕШНО ЗАВЕРШЕНА__");


		} catch (InterruptedException exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
		scanner.close();
	}
}
