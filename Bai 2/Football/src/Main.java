import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Khai báo thông tin cầu thủ
        ArrayList<Player> players = new ArrayList<Player>();
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

        //Thực hiện nhập xuất
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đội hình bạn muốn được hiển thị:(433- 352 - 442 - 451)");
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String[] inputs = input.split("");
            Team team = new Team(players);
            while (Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]) + Integer.parseInt(inputs[2]) != 10) {
                System.out.println("Giá trị bạn nhập vào chưa đúng!, vui lòng nhập lại");
                input = sc.nextLine();
                break;
            }
            team.buildTeam(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
            System.out.println("Nhập đội hình bạn muốn được hiển thị:(433- 352 - 442 - 451)");
        }
    }
}
