package org.javaacademy.wonder_field;

import java.util.Scanner;

public class Game {
		private final int NUMBER_OF_PLAYERS = 3;
		private final int NUMBER_OF_ROUNDS = 4;
		private final int NUMBER_OF_GROUP_ROUNDS = 3;
		private final int INDEX_OF_FINAL_ROUND = 3;

		static Scanner scanner = new Scanner(System.in);

		private DataGame dataGame = new DataGame();

		public Game() {
				this.dataGame = new DataGame();

		}

		// ИНИЦИАЛИЗАЦИЯ ИГРЫ
		public void init() {

				dataGame.setDataGame();


		}


}
