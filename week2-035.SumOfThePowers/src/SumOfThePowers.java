
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int i = 0;
        int result = (int)Math.pow(2, i);
        
        while (number >= i) {
            result += result;
            i++;
        }
        
        result--;
        
        System.out.println("The result is: " + result);
    }
}
