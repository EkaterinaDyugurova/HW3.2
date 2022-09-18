public class BmiService {
    public double calculate(double weight, double height) {
        double height2 = Math.pow(height, 2);
        double bmi = weight / height2;
        return bmi;
    }

}
