import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Goblin Cave!");
        System.out.println("Do you want to enter the cave or are you to scared and want to quit?");
        System.out.println("Press e to enter or q to quit: ");

        Scanner scanner = new Scanner(System.in);
        boolean validCommand = false;

        while(!validCommand) {
            String command = scanner.nextLine().trim();

            if (!command.equalsIgnoreCase("e") && !command.equalsIgnoreCase("q")) {
                System.out.println("Not valid! press either e to enter the cave og q to quit if you are too scared...");
            } else if (command.equalsIgnoreCase("e")) {
                validCommand = true;
                System.out.println("You enter the Goblin Cave!");
            } else if (command.equalsIgnoreCase("q")) {
                System.out.println("You are too scared and quit..");
                return;
            }
        }

        Player player1 = new Player(100, "Alex");

        System.out.println("This is the player that dared enter the goblin cave...\nName: " + player1.getName() + "\nHealth: " + player1.getHealth());
        player1.takeDamage(20);
        System.out.println(player1.getHealth());
        player1.takeDamage(10);
        System.out.println(player1.getHealth());
    }
}
