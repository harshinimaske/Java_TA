public class BMICalculator {
    public static void main(String[] args) {
        double weight = 60; // kg
        double height = 1.75; // meters

        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }
}