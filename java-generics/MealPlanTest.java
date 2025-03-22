import java.util.ArrayList;
import java.util.List;

// Interface for MealPlan
interface MealPlan {
    String getMealDetails();
}

// Different meal categories implementing MealPlan
class VegetarianMeal implements MealPlan {
    private String mealName;

    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealDetails() {
        return "Vegetarian Meal: " + mealName;
    }
}

class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealDetails() {
        return "Vegan Meal: " + mealName;
    }
}

class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealDetails() {
        return "Keto Meal: " + mealName;
    }
}

class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    public String getMealDetails() {
        return "High-Protein Meal: " + mealName;
    }
}

// Generic class to handle meal plans
class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }
}

// Utility class for meal generation and validation
class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(Meal<T> mealPlan) {
        System.out.println("Generated Meal Plan:");
        for (T meal : mealPlan.getMeals()) {
            System.out.println(meal.getMealDetails());
        }
    }
}

// Main class to test the Personalized Meal Plan Generator
public class MealPlanTest {
    public static void main(String[] args) {
        // Vegetarian meal plan
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        vegetarianPlan.addMeal(new VegetarianMeal("Grilled Veggie Salad"));
        vegetarianPlan.addMeal(new VegetarianMeal("Pasta Primavera"));

        // Vegan meal plan
        Meal<VeganMeal> veganPlan = new Meal<>();
        veganPlan.addMeal(new VeganMeal("Tofu Stir Fry"));
        veganPlan.addMeal(new VeganMeal("Vegan Buddha Bowl"));

        // Keto meal plan
        Meal<KetoMeal> ketoPlan = new Meal<>();
        ketoPlan.addMeal(new KetoMeal("Keto Chicken Alfredo"));
        ketoPlan.addMeal(new KetoMeal("Avocado Egg Salad"));

        // High-Protein meal plan
        Meal<HighProteinMeal> highProteinPlan = new Meal<>();
        highProteinPlan.addMeal(new HighProteinMeal("Grilled Chicken with Quinoa"));
        highProteinPlan.addMeal(new HighProteinMeal("Salmon and Brown Rice"));

        // Generating meal plans
        System.out.println("Vegetarian Meal Plan:");
        MealPlanGenerator.generateMealPlan(vegetarianPlan);

        System.out.println("\nVegan Meal Plan:");
        MealPlanGenerator.generateMealPlan(veganPlan);

        System.out.println("\nKeto Meal Plan:");
        MealPlanGenerator.generateMealPlan(ketoPlan);

        System.out.println("\nHigh-Protein Meal Plan:");
        MealPlanGenerator.generateMealPlan(highProteinPlan);
    }
}