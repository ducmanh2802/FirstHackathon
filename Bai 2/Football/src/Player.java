public class Player {
    private String fullName;
    private int num;
    private Player.Position position;

    public enum Position {
        GK(0), DF(1), MF(2), FW(3);

        private int value;

        private Position(int value) {
            this.value = value;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Player() {
    }

    public Player(int num,String fullName , Player.Position position) {
        this.fullName = fullName;
        this.num = num;
        this.position = position;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Player.Position getPosition() {
        return position;
    }

    public void setPosition(Player.Position position) {
        this.position = position;
    }
}
