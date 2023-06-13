public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.84;
        int weightInKilograms = 69;
        double BMI = service.calculate(heightInMeters, weightInKilograms); // должно получиться 20
        System.out.println(BMI);
    }
}