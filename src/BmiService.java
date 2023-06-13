public class BmiService {
    public int calculate(double heightInMeters, int weightInKilograms) {
        double BMI = weightInKilograms / (heightInMeters * heightInMeters);
        return (int) BMI;
    }
}