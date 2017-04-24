
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int i = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int j = Integer.parseInt(reader.nextLine());


        while (j>=i) {
            // write your code here
            System.out.println(i);
            i++;

        }
    }
}