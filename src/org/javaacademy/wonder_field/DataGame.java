package org.javaacademy.wonder_field;

import java.util.Scanner;

/*
 * ДАННЫЙ КЛАСС ЗАГРУЖАЕТ ДАННЫЕ (ВОПРОСЫ И ОТВЕТЫ) ДЛЯ ИНИЦИАЛИЗАЦИИ ИГРЫ В МАССИВЫ СТРОК.
 */
public class DataGame {

		private final String[] DATA_IN;

		public DataGame() {
				this.DATA_IN = new String[8];
//				setDataGame();

		}

		public void setDataGame() {

				System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.Вам нужно ввести вопросы " +
						"и ответы для игры: ");

				Scanner scanner = new Scanner(System.in);
				for (int i = 0; i < DATA_IN.length; i++) {
						DATA_IN[i] = scanner.nextLine();
				}
				System.out.println("Строки: ");
				for (String element : DATA_IN) {
						System.out.println(element);
				}
				System.out.println("Инициализация закончена, игра начнется через 5 секунд...");

				for (int i = 0; i <= 50; i++) {
						if(i == 10){
								System.out.println();
								System.out.println(".............");
						}
						if(i == 20){
								System.out.println();
								System.out.println(".......................");
						}
						if(i == 30){
								System.out.println();
								System.out.println("...............................");
						}
						if(i == 40){
								System.out.println();
								System.out.println("............................................");
						}
						if(i == 50){
								System.out.println();
								System.out.println(".......................................................");
								System.out.println();
								System.out.println("ЗАГРУЗКА ДАННЫХ УСПЕШНО ЗАВЕРШЕНА..........................................");
						}

						}

				scanner.close();
		}
}
