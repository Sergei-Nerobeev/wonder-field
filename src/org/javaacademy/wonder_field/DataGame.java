package org.javaacademy.wonder_field;

import java.util.Scanner;

/*
 * ДАННЫЙ КЛАСС ЗАГРУЖАЕТ И ОТДАЕТ ДАННЫЕ (ВОПРОСЫ И ОТВЕТЫ) В МАССИВ СТРОК.
 */
public class DataGame {
	private final String[] questions;
	private final String[] answers;


	public DataGame() {
		this.questions = new String[4];
		this.answers = new String[4];
	}

	public String[] getQuestions() {
		return questions;
	}public String[] getAnswers() {
		return answers;
	}

	public void setDataGame() {

		System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.Вам нужно ввести вопросы " +
				"и ответы для игры: ");

		Scanner scanner = new Scanner(System.in);

		try {

			for (int i = 0; i < questions.length; i++) {
				System.out.println("Введите вопрос № " + (i + 1));
				questions[i] = scanner.nextLine();

			  System.out.println("Введите ответ № " + (i + 1));
			  answers[i] = scanner.nextLine();
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
