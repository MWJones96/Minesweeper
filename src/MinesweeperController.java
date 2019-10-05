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
            //MinesweeperGridButton b = (MinesweeperGridButton) e.getComponent();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            MinesweeperGridButton b = (MinesweeperGridButton) e.getComponent();

            if (SwingUtilities.isRightMouseButton(e)) {
                System.out.println("Right click released!");
                if (b.getState() == -1) {
                    b.setState(10);
                }
            } else {
                v.drawGrid(m.getGameState());
            }
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