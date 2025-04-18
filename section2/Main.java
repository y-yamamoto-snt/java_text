public class Main {
    public static void main(String[] args) {
        // BMIの計算
        double height = 166.3; // (cm)
        double weight = 57.2;  // (kg)

        double bmi = weight / Math.pow(height*0.01, 2);
        System.out.printf("BMI: %.2f", bmi);
    }
}
