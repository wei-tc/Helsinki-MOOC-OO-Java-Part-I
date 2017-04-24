
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        int guessesMade = 0;
        
        while (true) {
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            guessesMade++; 
            
            if (numberDrawn == guess) {
                break;
            } else if (numberDrawn > guess) {
                System.out.println("The number is greater, guesses made: " + guessesMade);
            } else {
                System.out.println("The number is lesser, guesses made: " + guessesMade);
            }
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
