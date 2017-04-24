
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int number = first;

        while (last >= number) {
            sum += number;
            number++;
        }
        System.out.println("The sum is " + sum);
    }   
}
