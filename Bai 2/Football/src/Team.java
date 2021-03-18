import java.util.ArrayList;
import java.util.List;

public class Team {
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Player> teamXI = new ArrayList<Player>();
    
    public void input(){
        Player player1 = new Player(1, "Marc-André ter Stegen", Player.Position.GK);
        Player player2 = new Player(2, "Sergiño Dest", Player.Position.DF);
        Player player3 = new Player(3, "Gerard Piqué", Player.Position.DF);
        Player player4 = new Player(4, "Ronald Araújo", Player.Position.DF);
        Player player5 = new Player(5, "Sergio Busquets", Player.Position.MF);
        Player player6 = new Player(6, "Antoine Griezmann", Player.Position.FW);
        Player player7 = new Player(7, "Miralem Pjanić", Player.Position.MF);
        Player player8 = new Player(8, "Martin Braithwaite", Player.Position.FW);
        Player player9 = new Player(9, "Lionel Messi", Player.Position.FW);
        Player player10 = new Player(10, "Ousmane Dembélé", Player.Position.FW);
        Player player11 = new Player(11, "Riqui Puig", Player.Position.MF);
        Player player12 = new Player(12, "Neto", Player.Position.GK);
        Player player13 = new Player(13, "Clément Lenglet", Player.Position.DF);
        Player player14 = new Player(14, "Pedri", Player.Position.MF);
        Player player15 = new Player(15, "Francisco Trincão", Player.Position.FW);
        Player player16 = new Player(16, "Jordi Alba", Player.Position.DF);
        Player player17 = new Player(17, "Matheus Fernandes", Player.Position.MF);
        Player player18 = new Player(18, "Sergi Roberto", Player.Position.DF);
        Player player19 = new Player(19, "Frenkie de Jong", Player.Position.MF);
        Player player20 = new Player(20, "Ansu Fati", Player.Position.FW);
        Player player21 = new Player(21, "Samuel Umtiti", Player.Position.DF);
        Player player22 = new Player(22, "Junior Firpo", Player.Position.DF);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);
        players.add(player11);
        players.add(player12);
        players.add(player13);
        players.add(player14);
        players.add(player15);
        players.add(player16);
        players.add(player17);
        players.add(player18);
        players.add(player19);
        players.add(player20);
        players.add(player21);
        players.add(player22);

    }
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
                System.out.println("\n---------------------------");
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
