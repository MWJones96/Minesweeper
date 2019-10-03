import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class MinesweeperView extends JFrame {
	private JButton calculateButton = new JButton("Calculate");

	MinesweeperView() {
		// Sets up the view and adds the components
		JPanel calcPanel = new JPanel();
		calcPanel.setLayout(new GridLayout(10, 10));

		this.setTitle("Minesweeper");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 640);
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