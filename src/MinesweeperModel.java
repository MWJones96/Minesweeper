import java.util.Arrays;
import java.util.Random;

public class MinesweeperModel {
	private boolean[][] mines;
	private int[][] gameState;

	private boolean isGameOver = false;
	private boolean won = false;

	private static Random r = new Random();

	public MinesweeperModel() {
		mines = new boolean[10][10];
		gameState = new int[10][10];

		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				gameState[row][col] = r.nextInt(9);
			}
		}

		initMines(10);
	}

	private void initMines(int numMines) {
		for (int i = 0; i < numMines; i++) {
			int rX = r.nextInt(10);
			int rY = r.nextInt(10);

			while (mines[rX][rY]) {
				rX = r.nextInt(10);
				rY = r.nextInt(10);
			}

			mines[rX][rY] = true;
		}
	}

	public int[][] getGameState() {
		return this.gameState;
	}

	public void printState() {
		for (int[] row : gameState) {
			System.out.println(Arrays.toString(row));
		}
	}

	public void printMines() {
		for (boolean[] row : mines) {
			System.out.println(Arrays.toString(row));
		}
	}
}