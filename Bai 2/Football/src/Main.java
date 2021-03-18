import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Khai báo thông tin cầu thủ
        ArrayList<Player> players = new ArrayList<>();
        Team team = new Team(players);
        team.input();
        // Thực hiện nhập xuất
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your team format:(433- 352 - 442 - 451)");
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String[] inputs = input.split("");
            while (Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]) + Integer.parseInt(inputs[2]) != 10) {
                System.out.println("Invalid input, please try again!");
                input = sc.nextLine();
                break;
            }
            team.buildTeam(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
            System.out.println("Do you want to see another option? Type Y or N");
            String selection = sc.nextLine();
            try {
                int typeNumber = Integer.parseInt(selection);
                System.out.println("Can not be a selection, plaese try again!");
            } catch (NumberFormatException e) {
                while (selection.equals("N")) {
                    System.exit(0);
                }
            }

            System.out.println("Type your team format:(433- 352 - 442 - 451)");
        }
        sc.close();
    }
}
