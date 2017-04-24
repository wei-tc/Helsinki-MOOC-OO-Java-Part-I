import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int n = 0;
        int sum = 0;
        int numbers = 0;
        int even = 0;
        
        System.out.println("Type numbers: ");
        while (n != -1) {
            n = Integer.parseInt(reader.nextLine());
            if (n != -1) {
                sum += n;
                numbers++;
                if (n % 2 == 0) {
                    even++;
                }
            }
        }    
        
        double average = (double)sum/numbers;
        int odd = numbers - even; 
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
