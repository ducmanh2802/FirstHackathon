import java.util.ArrayList;
import java.util.List;

public class Team {
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Player> teamXI = new ArrayList<Player>();

    public Team(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Player> buildTeam(int defender, int midfielder, int forwarder) {
        List<Player> tempPlayers = new ArrayList<>();

        //tạo bản sao của danh sách cầu thủ
        for (int i = 0; i < players.size(); i++) {
            tempPlayers.add(players.get(i));
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
        for (int i = 0; i < teamXI.size(); i++) {
            System.out.println(teamXI.get(i).getNum() + " - " + teamXI.get(i).getFullName() + " - " + teamXI.get(i).getPosition());
            if (i == 0 || i == defender || i == defender + midfielder) {
                System.out.println("\n-----------------------------------------");
            }
        }
        return teamXI;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
