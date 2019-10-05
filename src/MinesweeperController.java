import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputListener;

public class MinesweeperController {

    private MinesweeperView v;
    private MinesweeperModel m;

    public MinesweeperController(MinesweeperView v, MinesweeperModel m) {
        this.v = v;
        this.m = m;

        MinesweeperGridButton[][] buttons = v.getButtons();
        for (MinesweeperGridButton[] row : buttons) {
            for (MinesweeperGridButton b : row) {
                b.addMouseListener(new GridButtonListener());
            }
        }
    }

    class GridButtonListener implements MouseInputListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            MinesweeperGridButton b = (MinesweeperGridButton) e.getComponent();
            System.out.println("Press");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            MinesweeperGridButton b = (MinesweeperGridButton) e.getComponent();
            m.clickSquare(b.getRow(), b.getCol());

            m.printState();
            v.drawGrid(m.getGameState());
            System.out.println("Release");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }

    }
}