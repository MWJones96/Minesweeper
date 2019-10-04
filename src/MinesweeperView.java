import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class MinesweeperView extends JFrame {
	private JButton calculateButton = new JButton("Calculate");

	MinesweeperView() {
		// Sets up the view and adds the components
		MinesweeperPanel calcPanel = new MinesweeperPanel();

		this.setTitle("Minesweeper");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(16 * 10 + 24, 99 + (10 * 16));
		this.setResizable(false);
		this.add(calcPanel);

		this.setLocationRelativeTo(null);
	}

	void addCalculateListener(ActionListener listenForCalcButton) {

		calculateButton.addActionListener(listenForCalcButton);

	}

	// Open a popup that contains the error message passed

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);

	}

}