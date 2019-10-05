import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MinesweeperGridButton extends JButton {
    private static ImageIcon covered = new ImageIcon("res/tile_covered.png");
    private static ImageIcon tile0 = new ImageIcon("res/tile_0.png");
    private static ImageIcon tile1 = new ImageIcon("res/tile_1.png");
    private static ImageIcon tile2 = new ImageIcon("res/tile_2.png");
    private static ImageIcon tile3 = new ImageIcon("res/tile_3.png");
    private static ImageIcon tile4 = new ImageIcon("res/tile_4.png");
    private static ImageIcon tile5 = new ImageIcon("res/tile_5.png");
    private static ImageIcon tile6 = new ImageIcon("res/tile_6.png");
    private static ImageIcon tile7 = new ImageIcon("res/tile_7.png");
    private static ImageIcon tile8 = new ImageIcon("res/tile_8.png");
    private static ImageIcon tileFlag = new ImageIcon("res/tile_flag.png");
    private static ImageIcon tileMine = new ImageIcon("res/tile_mine.png");
    private static ImageIcon tileMineClicked = new ImageIcon("res/tile_mine_clicked.png");
    private static ImageIcon tileQuestion = new ImageIcon("res/tile_question.png");

    private int row;
    private int col;

    public MinesweeperGridButton(int row, int col) {
        this.row = row;
        this.col = col;

        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);

        this.setIcon(covered);
    }

    public void setState(int state) {
        if (state != -1) {
            System.out.println(state);
        }
        switch (state) {
            case -1: this.setIcon(covered); break;
            case 0: this.setIcon(tile0); break;
            case 1: this.setIcon(tile1); break;
            case 2: this.setIcon(tile2); break;
            case 3: this.setIcon(tile3); break;
            case 4: this.setIcon(tile4); break;
            case 5: this.setIcon(tile5); break;
            case 6: this.setIcon(tile6); break;
            case 7: this.setIcon(tile7); break;
            case 8: this.setIcon(tile8); break;
            case 10: this.setIcon(tileFlag); break;
            case 11: this.setIcon(tileMine); break;
            case 12: this.setIcon(tileMineClicked); break;
            case 13: this.setIcon(tileQuestion); break;
        }
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }
}