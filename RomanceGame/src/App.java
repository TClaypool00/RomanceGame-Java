import java.util.Random;
import java.util.Scanner;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        try {
            String userInput = "";
            Person player = new Person(random);

            System.out.println("Welcome to Choose: A Romance game!");
            System.out.println("This is a choice-based game. Where you will hve the opportunity to find love.");
            System.out.println("Every choice you make matters. So choices have positive affects, some have negative affects.");
            System.out.println();
            System.out.println("So choose wisely... and have fun!");
            System.out.println();
            System.out.println("Let's begin. Who are you?");
            System.out.println();

            while (true) {
                System.out.print("Enter your first name: ");
                player.setFirstName(reader.nextLine());
                System.out.println();
                System.out.print("Enter your last name: ");
                player.setLastName(reader.nextLine());
                System.out.println();
                System.out.print("Are you a woman or a man? (m/f): ");
                player.setGender(reader.nextLine());

                System.out.print(player.toString() + " Is this correct? (y/n): ");
                userInput = reader.nextLine();
                System.out.println();

                if (userInput.equals("y")) {
                    System.out.println("That's great! It's nice to meet you " + player.getFullName() + "!");
                    break;
                } else {
                    System.out.println("That's too bad! Let's try again!");
                    System.out.println();
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
    }
}
