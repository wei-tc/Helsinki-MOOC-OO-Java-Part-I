
import java.util.Random;

public class PasswordRandomizer {

    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;

    }

    public String createPassword() {
        int i = 0;
        String password = "";
        while (i < length) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            password += symbol;
            i++;
        }
        return password;
    }
}
