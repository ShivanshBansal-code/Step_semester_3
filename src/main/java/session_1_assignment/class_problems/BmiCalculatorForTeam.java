package session_1_assignment.class_problems;

import java.util.Locale;

public class BmiCalculatorForTeam {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        if (heights == null || weights == null) {
            return;
        }

        int n = Math.min(heights.length, weights.length);

        for (int i = 0; i < n; i++) {
            double h = heights[i];
            double w = weights[i];
            double bmi = w / (h * h);
            String status = getBmiStatus(bmi);

            System.out.printf(Locale.US, "Person %d \u2014 Height: %.2f m, Weight: %.0f kg | BMI: %.2f | Status: %s%n",
                    (i + 1), h, w, bmi, status);
        }
    }

    public static void main(String[] args) {
        double[] heights = {1.75, 1.60};
        double[] weights = {70.0, 90.0};

        printWellnessReport(heights, weights);
    }
}
