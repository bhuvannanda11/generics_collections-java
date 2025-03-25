import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Vegetarian meals
        Meal<VegetarianPlan> vegMeals = new Meal<>();
        vegMeals.addMeal(new VegetarianPlan("Grilled Veggie Wrap", 300));
        vegMeals.addMeal(new VegetarianPlan("Quinoa Salad", 250));

        // Vegan meals
        Meal<VeganPlan> veganMeals = new Meal<>();
        veganMeals.addMeal(new VeganPlan("Tofu Stir-Fry", 400));
        veganMeals.addMeal(new VeganPlan("Lentil Soup", 350));

        // Keto meals
        Meal<KetoPlan> ketoMeals = new Meal<>();
        ketoMeals.addMeal(new KetoPlan("Chicken Salad", 600));
        ketoMeals.addMeal(new KetoPlan("Bacon & Eggs", 500));

        // Display individual categories
        System.out.println("\n--- Vegetarian Meals ---");
        vegMeals.displayMeals();

        System.out.println("\n--- Vegan Meals ---");
        veganMeals.displayMeals();

        System.out.println("\n--- Keto Meals ---");
        ketoMeals.displayMeals();

        // Generate a mixed personalized meal plan
        List<MealPlan> personalizedPlan = new ArrayList<>();
        personalizedPlan.add(new VegetarianPlan("Vegetable Curry", 400));
        personalizedPlan.add(new VeganPlan("Chickpea Bowl", 450));
        personalizedPlan.add(new KetoPlan("Steak & Avocado", 700));

        Meal.generateMealPlan(personalizedPlan);
    }
}