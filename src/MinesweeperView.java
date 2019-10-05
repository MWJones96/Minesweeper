import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class MinesweeperView extends JFrame {
	private MinesweeperPanel msPanel;

	public MinesweeperView() {
		this.msPanel = new MinesweeperPanel();

		this.setTitle("Minesweeper");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(16 * 10 + 24, 99 + (10 * 16));
		this.setResizable(false);
		this.add(msPanel);

		this.setLocationRelativeTo(null);
	}

	public MinesweeperGridButton[][] getButtons() {
		return msPanel.getButtons();
	}

	public void drawGrid(int[][] grid) {
		msPanel.drawGrid(grid);
	}
}