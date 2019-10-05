import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MinesweeperPanel extends JPanel {

    private MinesweeperGridButton[][] buttons;

    private static BufferedImage frame1;
    private static BufferedImage frame2;
    private static BufferedImage frame3;
    private static BufferedImage frame4;
    private static BufferedImage frame5;
    private static BufferedImage frame6;
    private static BufferedImage frame7;
    private static BufferedImage frame8;
    private static BufferedImage frame9;
    private static BufferedImage frame10;
    private static BufferedImage frame11;
    private static BufferedImage frame12;
    private static BufferedImage frame13;
    private static BufferedImage digit0;
    private static BufferedImage happyFace;
    private static BufferedImage numberDisplay;
    private static BufferedImage coveredSquare;

    public MinesweeperPanel(){
        buttons = new MinesweeperGridButton[10][10];
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                buttons[row][col] = new MinesweeperGridButton(row, col);
            }
        }

        try {
            frame1 = ImageIO.read(new File("res/frame_1.png"));
            frame2 = ImageIO.read(new File("res/frame_2.png"));
            frame3 = ImageIO.read(new File("res/frame_3.png"));
            frame4 = ImageIO.read(new File("res/frame_4.png"));
            frame5 = ImageIO.read(new File("res/frame_5.png"));
            frame6 = ImageIO.read(new File("res/frame_6.png"));
            frame7 = ImageIO.read(new File("res/frame_7.png"));
            frame8 = ImageIO.read(new File("res/frame_8.png"));
            frame9 = ImageIO.read(new File("res/frame_9.png"));
            frame10 = ImageIO.read(new File("res/frame_10.png"));
            frame11 = ImageIO.read(new File("res/frame_11.png"));
            frame12 = ImageIO.read(new File("res/frame_12.png"));
            frame13 = ImageIO.read(new File("res/frame_13.png"));
            digit0 = ImageIO.read(new File("res/digit_0.png"));
            happyFace = ImageIO.read(new File("res/button_smile.png"));
            numberDisplay = ImageIO.read(new File("res/number_display.png"));
            coveredSquare = ImageIO.read(new File("res/tile_covered.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.LIGHT_GRAY);
        g.drawImage(frame1, 0, 0, this);

        for (int i = 0; i < 16 * 10; i++) {
            g.drawImage(frame2, 12 + i, 0, this);
        }

        g.drawImage(frame3, 12 + 16 * 10, 0, this);

        for (int i = 0; i < 35; i++) {
            g.drawImage(frame4, 0, 11 + i, this);
        }

        for (int i = 0; i < 35; i++) {
            g.drawImage(frame5, 12 + 16 * 10, 11 + i, this);
        }

        int off = 11 + 35;

        g.drawImage(frame6, 0, off, this);
        for (int i = 0; i < 10 * 16; i++) {
            g.drawImage(frame7, 12 + i, off, this);
        }
        g.drawImage(frame8, 10 * 16 + 12, off, this);

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                buttons[row][col].setBounds(13 + 16*col, 11 + 16*row + off, 16, 16);
                this.add(buttons[row][col]);
            }
        }

        for (int i = 0; i < 10 * 16; i++) {
            g.drawImage(frame9, 0, 11 + i + off, this);
        }

        g.drawImage(frame11, 0, 11 + 10 * 16 + off, this);

        for (int i = 0; i < 10 * 16; i++) {
            g.drawImage(frame12, 12 + i, 11 + 10 * 16 + off, this);
        }

        g.drawImage(frame13, 12 + 10 * 16, 11 + 10 * 16 + off, this);

        for (int i = 0; i < 10 * 16; i++) {
            g.drawImage(frame10, 10 * 16 + 12, 11 + i + off, this);
        }

        g.drawImage(numberDisplay, 12 + 5, 11 + 5, this);
        g.drawImage(digit0, 12 + 7, 11 + 7, this);
        g.drawImage(digit0, 12 + 7 + 11 + 2, 11 + 7, this);
        g.drawImage(digit0, 12 + 7 + 11 + 2 + 11 + 2, 11 + 7, this);

        g.drawImage(numberDisplay, 16 * 10 + 7 - 41, 11 + 5, this);
        g.drawImage(digit0, 16 * 10 + 7 - 41 + 2, 11 + 7, this);
        g.drawImage(digit0, 16 * 10 + 7 - 41 + 2 + 11 + 2, 11 + 7, this);
        g.drawImage(digit0, 16 * 10 + 7 - 41 + 2 + 11 + 2 + 11 + 2, 11 + 7, this);

        g.drawImage(happyFace, ((16 * 10 + 24) / 2) - 13, 57 / 2 - 13, this);
    }

    public void drawGrid(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] != buttons[row][col].getState())
                    buttons[row][col].setState(grid[row][col]);
            }
        }
    }

    public MinesweeperGridButton[][] getButtons() {
        return this.buttons;
    }
}