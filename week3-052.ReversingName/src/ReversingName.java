
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int i = 0;
        String reverse = "";

        while (i < name.length()) {
            i++;
            reverse += name.charAt(name.length() - i);
            
        }
        System.out.println("In reverse order: " + reverse);
    }
}
