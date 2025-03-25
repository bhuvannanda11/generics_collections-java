package java_collections_streams.java_generics.meal_plan_generator;

public class VeganPlan implements MealPlan {
    private String mealName;
    private int calories;

    public VeganPlan(String mealName, int calories) {
        this.mealName = mealName;
        this.calories = calories;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public void display() {
        System.out.println("Vegan Meal: " + mealName + " (" + calories + " cal)");
    }
}