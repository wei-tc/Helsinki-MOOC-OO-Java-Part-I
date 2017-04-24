import java.util.Scanner;
import java.util.ArrayList;

public class Main {  

    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in);
        Database database = new Database();
        
        while (true) { 
            System.out.print("? ");
            String command = reader.nextLine();
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin Name: ");
                String latinName = reader.nextLine();
                database.addBird(name, latinName);
            } else if (command.equals("Observation")) {
                System.out.println("What was observed? ");
                String name = reader.nextLine();
                for (Bird bird : database.database()) {
                    if (bird.getName().equals(name)) {
                        bird.setObservation();
                    }
                }
                System.out.println("Is not a bird!");
            } else if (command.equals("Statistics")) {
                database.printStatistics();
            } else if (command.equals("Show")) {
                System.out.println("What? ");
                String name = reader.nextLine();
                for (Bird bird : database.database()) {
                    if (bird.getName().equals(name)) {
                        System.out.println(bird);
                    }
                }
            } else if (command.equals("Quit")) {
                break;
            }
        }
    }

}
