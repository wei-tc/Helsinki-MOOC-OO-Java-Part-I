
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.      
        while (true) {
            System.out.println("Input temperature (-30.0 to 40.0 degrees): ");
            double temperature = Double.parseDouble(reader.nextLine());
            if (temperature >= -30.0 && temperature <= 40.0) {
                Graph.addNumber(temperature);
            }
        }
    }
}
