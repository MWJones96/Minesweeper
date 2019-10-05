public enum MinesweeperGridType {
    UNCOVERED(-1),
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    FLAG(10),
    MINE(11),
    MINE_CLICKED(12),
    QUESTION(13);

    private int num;

    public int getNum() {
        return this.num;
    }

    private MinesweeperGridType(int num) {
        this.num = num;
    }
}