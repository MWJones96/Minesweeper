import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MinesweeperPanel extends JPanel {
    private static BufferedImage topLeft;
    private static BufferedImage topEdge;
    private static BufferedImage topLeftEdge;
    private static BufferedImage numberDisplay;

    public MinesweeperPanel(){
        try {
            topLeft = ImageIO.read(new File("res/frame_top_left.png"));
            topEdge = ImageIO.read(new File("res/frame_top_edge.png"));
            topLeftEdge = ImageIO.read(new File("res/frame_top_left_edge.png"));
            numberDisplay = ImageIO.read(new File("res/number_display.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.LIGHT_GRAY);

        g.drawImage(topLeft, 0, 0, this);
        for (int i = 12; i < 100; i++) {
            g.drawImage(topEdge, i, 0, this);
        }
        for (int i = 11; i < 100; i++) {
            g.drawImage(topLeftEdge, 0, i, this);
        }

        g.drawImage(numberDisplay, 16, 15, this);
    }
}