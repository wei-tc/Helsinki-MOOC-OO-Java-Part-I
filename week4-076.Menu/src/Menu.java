
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        for (String mealz : meals) {
            System.out.println(mealz);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
    // add the methods here
}
