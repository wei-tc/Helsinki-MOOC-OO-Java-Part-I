
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        int result = Math.max(numberOne, numberTwo);
        System.out.println("The biggest number of the two numbers given was: " + result);
        
    }
}
