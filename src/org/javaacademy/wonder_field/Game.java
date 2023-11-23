package org.javaacademy.wonder_field;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
		private final int PLAYER_1 = 1;
		private final int PLAYER_2 = 2;
		private final int PLAYER_3 = 3;
		private final int ROUND_1 = 1;
		private final int ROUND_2 = 2;
		private final int ROUND_3 = 3;
		private final int ROUND_4 = 4;
		private final int GROUP_ROUND_1 = 1;
		private final int GROUP_ROUND_2 = 2;
		private final int GROUP_ROUND_3 = 3;
		private final int INDEX_OF_FINAL_ROUND_1 = 1;
		private final int INDEX_OF_FINAL_ROUND_2 = 2;
		private final int INDEX_OF_FINAL_ROUND_3 = 3;

		static Scanner scanner = new Scanner(System.in);

		private DataGame dataGame = new DataGame();

		public Game() {
				this.dataGame = new DataGame();
		}

		// ИНИЦИАЛИЗАЦИЯ ИГРЫ
		public void init()  {

			dataGame.setDataGame();
//			todo удалить перед отправкой

			System.out.println(Arrays.toString(dataGame.getDataGame()));


		}


}
