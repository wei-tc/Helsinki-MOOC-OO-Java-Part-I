import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        int i = 0;
        
        
        while (i < 7) {
            int drawnNumber = random.nextInt(39) + 1;
            while (containsNumber(drawnNumber)) {
                drawnNumber = random.nextInt(39) + 1;
            }
            numbers.add(drawnNumber);
            i++;
        }
    }

    public boolean containsNumber(int number) {
        if (!(numbers.contains(number))) {
            return false;
        }
        return true;
    }
}
