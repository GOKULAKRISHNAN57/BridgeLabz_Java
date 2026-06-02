package Collection_Streams_Junit_Regex.Generics_;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "High Protein";
    }
}

class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }
}

public class PersonalizedMealPlanGenerator {

    public static <T extends MealPlan> void generateMealPlan(
            Meal<T> meal) {

        System.out.println(
                "Generated Meal Plan : "
                        + meal.getMealPlan().getMealType());
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> meal =
                new Meal<>(new VegetarianMeal());

        generateMealPlan(meal);
    }
}