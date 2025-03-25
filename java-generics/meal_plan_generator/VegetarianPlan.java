public class VegetarianPlan implements MealPlan{
    private String mealName;
    private int calories;

    public VegetarianPlan (String mealName, int calories) {
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
        System.out.println("Vegetarian Meal: " + mealName + " (" + calories + " cal)");
    }
}