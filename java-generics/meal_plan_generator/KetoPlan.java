
public class KetoPlan implements MealPlan {
    private String mealName;
    private int calories;

    public KetoPlan(String mealName, int calories) {
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
        System.out.println("Keto Meal: " + mealName + " (" + calories + " cal)");
    }
}