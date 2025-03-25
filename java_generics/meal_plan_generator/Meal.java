package java_collections_streams.java_generics.meal_plan_generator;
import java.util.*;

public class Meal<T extends MealPlan> {
    private List<T> mealPlans = new ArrayList<>();

    public void addMeal(T meal) {
        mealPlans.add(meal);
    }

    public void displayMeals() {
        for (T meal : mealPlans) {
            meal.display();
        }
    }

    // Generic method to validate and generate meal plans dynamically
    public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
        System.out.println("\n--- Personalized Meal Plan ---");
        for (T meal : meals) {
            meal.display();
        }
    }
}