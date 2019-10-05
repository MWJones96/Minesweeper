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
				gameState[row][col] = -1;
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

		printMines();
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

	public void clickSquare(int row, int col) {
		if (isGameOver || gameState[row][col] >= 0) {
			return;
		}

		if (mines[row][col]) {
			gameState[row][col] = 12;
			isGameOver = true;
		} else {
			floodFill(row, col);
		}
	}

	private void floodFill(int row, int col) {
		if (row < 0 || row >= 10 || col < 0 || col >= 10 || mines[row][col] || (gameState[row][col] >= 0 && gameState[row][col] < 9)) {
			return;
		}

		gameState[row][col] = numNeighbourMines(row, col);
		if (gameState[row][col] == 0) {
			floodFill(row - 1, col);
			floodFill(row + 1, col);
			floodFill(row, col - 1);
			floodFill(row, col + 1);

			floodFill(row - 1, col - 1);
			floodFill(row - 1, col + 1);
			floodFill(row + 1, col - 1);
			floodFill(row + 1, col + 1);
		}
	}

	private int numNeighbourMines(int row, int col) {
		int count = 0;
		if (row - 1 >= 0 && mines[row - 1][col]) { count++; }
		if (row + 1 < 10 && mines[row + 1][col]) { count++; }
		if (col - 1 >= 0 && mines[row][col - 1]) { count++; }
		if (col + 1 < 10 && mines[row][col + 1]) { count++; }
		if (row - 1 >= 0 && col - 1 >= 0 && mines[row - 1][col - 1]) { count++; }
		if (row - 1 >= 0 && col + 1 < 10 && mines[row - 1][col + 1]) { count++; }
		if (row + 1 < 10 && col - 1 >= 0 && mines[row + 1][col - 1]) { count++; }
		if (row + 1 < 10 && col + 1 < 10 && mines[row + 1][col + 1]) { count++; }
		return count;
	}
}