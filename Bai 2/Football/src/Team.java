import java.util.ArrayList;
import java.util.List;

public class Team {
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Player> teamXI = new ArrayList<Player>();

    public ArrayList<Player> buildTeam(int defender, int midfielder, int forwarder) {
        List<Player> tempPlayers = new ArrayList<>();
        for (int i = 0; i < players.size(); i++) {
            tempPlayers.add(players.get(i));
        }
        while (defender + midfielder + forwarder != 10) {
            System.out.println("Số lượng bạn nhập vào chưa đúng!, vui lòng nhập lại");
        }

        int random = (int) Math.floor(Math.random() * tempPlayers.size());
        Player randomPlayer = tempPlayers.get(random);
        int countDefender = 0, countMidfielder = 0, countForwarder = 0, countGk = 0;

        while (countGk < 1) {
            random = (int) Math.floor(Math.random() * tempPlayers.size());
            randomPlayer = tempPlayers.get(random);
            if (randomPlayer.getPosition().equals(Player.Position.GK)) {
                teamXI.add(randomPlayer);
                break;
            }
        }

        while (countDefender < defender) {
            random = (int) Math.floor(Math.random() * tempPlayers.size());
            randomPlayer = tempPlayers.get(random);
            if (randomPlayer.getPosition().equals(Player.Position.DF)) {
                teamXI.add(randomPlayer);
                tempPlayers.remove(random);
                countDefender++;
            }
        }

        while (countMidfielder < midfielder) {
            random = (int) Math.floor(Math.random() * tempPlayers.size());
            randomPlayer = tempPlayers.get(random);

            if (randomPlayer.getPosition().equals(Player.Position.MF)) {
                teamXI.add(randomPlayer);
                tempPlayers.remove(random);
                countMidfielder++;
            }
        }
        while (countForwarder < forwarder) {
            random = (int) Math.floor(Math.random() * tempPlayers.size());
            randomPlayer = tempPlayers.get(random);
            if (randomPlayer.getPosition().equals(Player.Position.FW)) {
                teamXI.add(randomPlayer);
                tempPlayers.remove(random);
                countForwarder++;
            }
        }
        for (int i =0; i< teamXI.size();i++) {
            System.out.println(teamXI.get(i).getFullName() + " " + teamXI.get(i).getPosition());
        }
        return teamXI;
    }

    public Team(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
