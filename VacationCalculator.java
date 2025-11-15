/*
method to calculate total vacation cost
Mary Wanjiru
S08-8423-2024
*/

public class VacationCalculator {
public static double calculateTotalCost(double accommodationCost,
                                            double mealCost,
                                            double activityCost) {
        double total = accommodationCost + mealCost + activityCost;
        return total;
    }

    public static void main(String[] args) {
        double accommodation = 800.50;
        double meals = 420.25;
        double activities = 200.00;

        double total = calculateTotalCost(accommodation, meals, activities);


        
        System.out.printf("Total cost:    $%.2f%n", total);
    }}
