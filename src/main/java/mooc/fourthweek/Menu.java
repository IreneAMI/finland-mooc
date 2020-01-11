package mooc.fourthweek;

import java.util.ArrayList;

public class Menu {
    String meal;

    ArrayList<String> meals = new ArrayList<>();

    public Menu(String meal) {
        this.meals = new ArrayList<String>();
        meals.add(meal);
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (int i = 0; i < meals.size(); i++) {
            System.out.println(meals.get(i));
        }
    }
    public void clearMenu() {
        this.meals.clear();
    }
}
