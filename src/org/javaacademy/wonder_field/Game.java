package org.javaacademy.wonder_field;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
  private final int playersCount = 3;
  private final int roundsCount = 4;
  private final int groupsRoundCount = 3;
  private final int indexOfFinalRound = 3;
  private final String[] questions;
  private final String[] answers;

  public Game() {
    this.questions = new String[4];
    this.answers = new String[4];
  }

  public String[] getQuestions() {
    return questions;
  }

  public String[] getAnswers() {
    return answers;
  }

  static final Scanner SCANNER = new Scanner(System.in);

  // ИНИЦИАЛИЗАЦИЯ ИГРЫ
  public void init() {

    System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.Вам нужно ввести вопросы " +
                           "и ответы для игры: ");

    try {

      for (int i = 0; i < questions.length; i++) {
        System.out.println("Введите вопрос № " + (i + 1));
        questions[i] = SCANNER.nextLine();

        System.out.println("Введите ответ № " + (i + 1));
        answers[i] = SCANNER.nextLine();
      }

      System.out.println("Инициализация закончена, игра начнется через 5 секунд.....");
      Thread.sleep(5000);
      for (int i = 0; i <= 50; i++) {

        System.out.println();
      }

    }
    catch (InterruptedException exception) {
      System.out.println("Произошла неизвестная ошибка!");
      exception.printStackTrace();
    }

  }

}


