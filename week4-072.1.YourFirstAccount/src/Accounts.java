
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account bobsAccount = new Account("Bob's account", 100.0);
        bobsAccount.deposit(20.0);
        System.out.println(bobsAccount);
        
    }

}
