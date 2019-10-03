public class MinesweeperClient {

    public static void main(String[] args) {
        MinesweeperModel m = new MinesweeperModel();
        MinesweeperView v = new MinesweeperView();
        MinesweeperController c = new MinesweeperController(v, m);

        v.setVisible(true);
    }
}