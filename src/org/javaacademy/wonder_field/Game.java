package org.javaacademy.wonder_field;

import java.util.Arrays;
import java.util.Scanner;
/*
 * КЛАСС ИГРА, СБОРЩИК ДРУГИХ ОБЬЕКТОВ ПРОГРАММЫ
 */

public class Game {
		private final int player1 = 1;
		private final int player2 = 2;
		private final int player3 = 3;
		private final int round1 = 1;
		private final int round2 = 2;
		private final int round3 = 3;
		private final int round4 = 4;
		private final int groupRound1 = 1;
		private final int groupRound2 = 2;
		private final int groupRound3 = 3;
		private final int indexOfFinalRound1 = 1;
		private final int indexOfFinalRound2 = 2;
		private final int indexOfFinalRound3 = 3;

		private final static Scanner scanner = new Scanner(System.in);
		private final DataGame dataGame;

		public Game() {
				this.dataGame = new DataGame();
		}

		// ИНИЦИАЛИЗАЦИЯ ИГРЫ
		public void init() {

				dataGame.setDataGame();
				String[] questions = dataGame.getQuestions();
				String[] answers = dataGame.getAnswers();

		}


}
