import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MinesweeperGridButton extends JButton {
    private int row;
    private int col;
    private int state;

    public MinesweeperGridButton(int row, int col) {
        this.row = row;
        this.col = col;
        this.state = -1;

        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);

        this.setIcon(new ImageIcon("res/tile_covered.png"));
    }

    public void setState(int state) {
        this.state = state;

        switch (state) {
            case -1: this.setIcon(new ImageIcon("res/tile_covered.png")); break;
            case 0: this.setIcon(new ImageIcon("res/tile_0.png")); break;
            case 1: this.setIcon(new ImageIcon("res/tile_1.png")); break;
            case 2: this.setIcon(new ImageIcon("res/tile_2.png")); break;
            case 3: this.setIcon(new ImageIcon("res/tile_3.png")); break;
            case 4: this.setIcon(new ImageIcon("res/tile_4.png")); break;
            case 5: this.setIcon(new ImageIcon("res/tile_5.png")); break;
            case 6: this.setIcon(new ImageIcon("res/tile_6.png")); break;
            case 7: this.setIcon(new ImageIcon("res/tile_7.png")); break;
            case 8: this.setIcon(new ImageIcon("res/tile_8.png")); break;
            case 9: this.setIcon(new ImageIcon("res/tile_9.png")); break;
            case 10: this.setIcon(new ImageIcon("res/tile_flag.png")); break;
            case 11: this.setIcon(new ImageIcon("res/tile_mine.png")); break;
            case 12: this.setIcon(new ImageIcon("res/tile_mine_clicked.png")); break;
            case 13: this.setIcon(new ImageIcon("res/tile_question.png")); break;
        }
    }

    public int getState() {
        return this.state;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }
}