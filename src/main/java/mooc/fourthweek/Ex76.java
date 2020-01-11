package mooc.fourthweek;
/*implement a class Menu that holds information about meals that are available in a cafeteria.
* Exercise 76.1: Adding a meal to menu
Implement the method public void addMeal(String meal) that adds a new meal to the list this.meals of a Menu object. If the meal is already in the list, it should not be added.*/

import java.util.ArrayList;

public class Ex76 {
    public static void main(String[] args) {
        System.out.println("Meals added to the menu");
        Menu firstDish = new Menu("tomato soup");
        firstDish.addMeal("patatas bravas");
        firstDish.printMeals();
        firstDish.clearMenu();
        System.out.println("Cleared meals");
        firstDish.printMeals();
    }
}
