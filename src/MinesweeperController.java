import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinesweeperController {

    private MinesweeperView v;
    private MinesweeperModel m;

    public MinesweeperController(MinesweeperView v, MinesweeperModel m) {
        this.v = v;
        this.m = m;

        this.v.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        }

    }

}