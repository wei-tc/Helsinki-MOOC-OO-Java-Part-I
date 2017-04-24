
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String reverse = "";
        int i = text.length() - 1;
        while (i >= 0) {
            reverse += text.charAt(i);
            i--;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
