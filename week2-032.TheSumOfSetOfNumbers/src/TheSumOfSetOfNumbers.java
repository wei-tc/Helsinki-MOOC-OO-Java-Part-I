
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 0;
        int store = 0;
        
        while (number > i) {
            i++;
            store = store + i;
            
        }
        
        System.out.println("Sum is " + store);
    }
}
