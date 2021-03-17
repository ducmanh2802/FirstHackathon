import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Player> players = new ArrayList<Player>();
    public List<Player> buildTeam() {
        return players;
	}
    public List<Player> buildTeam(int defender, int midfielder, int forwarder) {
        while(defender + midfielder + forwarder !=10){
            System.out.println("Số lượng bạn nhập vào chưa đúng!, vui lòng nhập lại");
        }
        for (int i = 0; i < defender; i++) {
            if(players.get(Random(0,11)).Position.getPosition().equals("DF")){
                players.add(e)
            }
        }
        for (int i = 0; i < midfielder; i++) {

        }
        for (int i = 0; i < forwarder; i++) {

        }
        return players;
    }

}
